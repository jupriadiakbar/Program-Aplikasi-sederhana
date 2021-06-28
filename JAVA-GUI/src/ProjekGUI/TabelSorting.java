package ProjekGUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;

public class TabelSorting {
    private JPanel RootPanel;
    private JTextField textAngka;
    private JButton button1;
    private JTable table1;
    private JTextField textjumlah;
    private DefaultTableModel tableModel1;
    private boolean SortingData = false;
    private Object DefaultTabelModel;

    public JPanel getRootPanel() {return RootPanel;
    }

    public TabelSorting() {
        this.initComponents();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) table1.getModel();

                String data = textAngka.getText();
                if (data.isEmpty()) {
                    JOptionPane.showMessageDialog(RootPanel,
                            "Data Belum Lengkap",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    tableModel1.addRow(new Object[]{data});
                    //clear textField
                    textAngka.setText("");
                }


                int c = Integer.parseInt(textjumlah.getText());

                if (!SortingData) {
                    for (int i = 0; i < c; i++) {
                        model.addRow(new Object[]{});
                    }
                    SortingData = true;
                }
                int a = 0;
                for (int i : CodeData.getA(data, c)) {
                    model.setValueAt(i, a, 0);
                    a++;
                }
                int b = 0;
                for (int i : CodeData.getD(data, c)) {
                    model.setValueAt(i, b, 1);
                    b++;
                }
            }
        });

    }

            private void initComponents() {
                Object[] tableColom = {
                        "Angka Naik", "Angka Turun"
                };
                Object[][] initData = {

                };
                tableModel1 = new DefaultTableModel(initData, tableColom);
                table1.setModel(tableModel1);
                table1.setAutoCreateRowSorter(true);
                table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }
        }
