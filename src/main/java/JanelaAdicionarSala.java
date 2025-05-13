import javax.swing.*;

public class JanelaAdicionarSala extends JFrame {
    private JPanel painelAdicionarSala;
    private JTextArea textNomeSala;
    private JTextArea textNrFilas;
    private JTextArea textNrLugareFila;
    private JRadioButton rbtnDolby;
    private JRadioButton rbtnSomSurround;
    private JRadioButton rbtn2D;
    private JRadioButton rbtn3D;
    private JButton btnConfirmarSala;
    private JButton btnCancelarSala;

    public JanelaAdicionarSala(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelAdicionarSala);
        pack();
    }
    public static void main(String[] args) {
        new JanelaAdicionarSala("Adicionar Sala").setVisible(true);
    }
}
