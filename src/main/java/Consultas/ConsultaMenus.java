package Consultas;

import javax.swing.*;

public class ConsultaMenus extends JFrame {
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JPanel panel1;
    private JButton confirmarButton1;
    private JButton cancelarButton;

    public ConsultaMenus() {
        setTitle("Análise dos menus vendidos num mes");
        setContentPane(panel1);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.
        pack();
        setSize(600, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ConsultaMenus();
    }
}
