package ProjekGUI;

    import javax.swing.*;
public class RunTabelSorting1 {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
          } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {
        }

        /**
         * set image icon
         */
        ImageIcon imageIcon = new ImageIcon("res/icon.png");
        JFrame jframe = new JFrame("from TabelSorting");
        jframe.setIconImage(imageIcon.getImage());
        jframe.setContentPane(new TabelSorting().getRootPanel());
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(500,400);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);





    }
}
