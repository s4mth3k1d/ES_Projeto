package Bilhetes;

import javax.swing.*;

public class AplicarDesconto extends JFrame {
    private JPanel panel1;
    private JButton cancelarButton;
    private JButton confirmarButton;
    private JComboBox comboBox1;

    public AplicarDesconto() {
        setTitle("Aplicar Desconto");
        setContentPane(panel1);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.
        pack();
        setSize(600, 250); // sets window size to 800x600 pixels
        setVisible(true);
    }

    public static void main(String[] args) {
        new AplicarDesconto();
    }
}
