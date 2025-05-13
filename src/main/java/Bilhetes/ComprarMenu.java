package Bilhetes;

import javax.swing.*;

public class ComprarMenu extends JFrame {
    private JButton nãoButton;
    private JButton simButton;
    private JPanel panel1;
    private JTextField textField1;

    public ComprarMenu() {
        setTitle("Comprar Menu");
        setContentPane(panel1);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.
        pack();
        setSize(400, 200); // sets window size to 800x600 pixels
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComprarMenu();
    }
}

