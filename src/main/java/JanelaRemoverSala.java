import javax.swing.*;

public class JanelaRemoverSala extends JFrame {
    private JPanel painelRemoverSala;
    private JComboBox comboBox1;
    private JButton btnConfirmarRemoverSala;
    private JButton btnCancelarRemoverSala;

    public JanelaRemoverSala(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelRemoverSala);
        pack();
    }
    public static void main(String[] args) {
        new JanelaRemoverSala("Remover Sala").setVisible(true);
    }

}
