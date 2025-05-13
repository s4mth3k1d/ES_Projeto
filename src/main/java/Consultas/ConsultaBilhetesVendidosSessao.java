package Consultas;

import javax.swing.*;

public class ConsultaBilhetesVendidosSessao extends JFrame {
    private JPanel panel1;
    private JButton voltarButton;
    private JComboBox comboBox1;
    private JList list1;
    private JComboBox comboBox2;
    private JButton confirmarButton;

    public ConsultaBilhetesVendidosSessao() {
        setTitle("Análise dos bilhetes vendidos baseado numa sessao");
        setContentPane(panel1);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.
        pack();
        setSize(600, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ConsultaBilhetesVendidosSessao();
    }
}
