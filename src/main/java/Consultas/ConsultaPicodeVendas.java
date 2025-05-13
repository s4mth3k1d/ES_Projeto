package Consultas;

import javax.swing.*;

public class ConsultaPicodeVendas extends JFrame {
    private JTextField textField1;
    private JButton voltarButton;
    private JButton confirmarButton;
    private JPanel panel1;

    public ConsultaPicodeVendas() {
        setTitle("Análise de picos de vendas");
        setContentPane(panel1);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.
        pack();
        setSize(600, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ConsultaPicodeVendas();
    }
}
