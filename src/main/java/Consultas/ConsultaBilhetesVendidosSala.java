package Consultas;

import javax.swing.*;

public class ConsultaBilhetesVendidosSala extends JFrame {
    private JButton voltarButton;
    private JComboBox comboBox1;
    private JList list1;
    private JComboBox comboBox2;
    private JButton confirmarButton;
    private JPanel panel1;


    public ConsultaBilhetesVendidosSala() {
        setTitle("Análise dos bilhetes vendidos baseado numa sala");
        setContentPane(panel1);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.
        pack();
        setSize(600, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ConsultaBilhetesVendidosSala();
    }
}
