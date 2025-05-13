package Bilhetes;

import javax.swing.*;

public class ComprarBilhete extends JFrame{
    private JLabel label1;
    private JButton cancelarButton;
    private JButton comfirmarButton;
    private JTextField textField1;
    private JPanel panel1;
    private JList list1;

    public ComprarBilhete() {
        setTitle("Comprar Bilhete");
        setContentPane(panel1);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.
        pack();
        setSize(500, 275); // sets window size to 800x600 pixels
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComprarBilhete();

    }
}
