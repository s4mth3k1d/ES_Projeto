package Bilhetes;

import javax.swing.*;

public class AtualizarPrecos extends JFrame {
    private JComboBox comboBox1;
    private JTextField textField1;
    private JButton cancelarButton;
    private JButton confirmarButton;
    private JPanel panel1;

    public AtualizarPrecos() {
        setTitle("Atualizar Precos");
        setContentPane(panel1);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.
        pack();
        setSize(400, 200); // sets window size to 800x600 pixels
        setVisible(true);
    }

    public static void main(String[] args) {
        new AtualizarPrecos();
    }
}
