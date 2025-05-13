package Consultas;

import javax.swing.*;
import java.awt.*;

public class Consultar extends JFrame {
    private JButton númeroDeBilhetesVendidosButton;
    private JButton númeroDeMenusVendidosButton;
    private JButton picosDeVendasDeButton;
    private JButton voltarAoMenuInicialButton;
    private JPanel panel1;

    public Consultar() {
        setTitle("Gestão de Consultas");
        setContentPane(panel1);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.
        pack();
        setSize(600, 250); // sets window size to 800x600 pixels
        setVisible(true);
    }

    public static void main(String[] args) {
        new Consultar();
    }
}
