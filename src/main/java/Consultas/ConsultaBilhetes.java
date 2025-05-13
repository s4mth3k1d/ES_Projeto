package Consultas;

import javax.swing.*;

public class ConsultaBilhetes extends JFrame {
    private JButton voltarButton;
    private JButton filmeButton;
    private JButton salaButton;
    private JButton sessãoButton;
    private JPanel panel1;
    private JButton categoriaButton;

    public ConsultaBilhetes() {
        setTitle("Análise de bilhetes vendidos");
        setContentPane(panel1);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.
        pack();
        setSize(600, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ConsultaBilhetes();
    }
}
