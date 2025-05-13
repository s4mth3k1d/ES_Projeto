package Bilhetes;

import javax.swing.*;

public class GestaoBilhetes extends JFrame {
    private JButton voltarButton;
    private JButton comprarBilhetesButton;
    private JButton atualizarPreçosButton;
    private JPanel panel1;

    public GestaoBilhetes() {
        setTitle("Gestao dos Bilhetes");
        setContentPane(panel1);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.
        pack();
        setSize(400, 200); // sets window size to 800x600 pixels
        setVisible(true);
    }

    public static void main(String[] args) {
        new GestaoBilhetes();
    }
}
