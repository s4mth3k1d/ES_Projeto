import javax.swing.*;

public class JanelaBar extends JFrame {
    private JPanel painelBar;
    private JList list1;
    private JButton btnAddProduto;
    private JButton btnVoltarPaginaPrincipal;
    private JButton btnConsultarStock;

    public JanelaBar(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelBar);
        pack();
    }
    public static void main(String[] args) {
        new JanelaBar("Gestão do espaço Bar").setVisible(true);
    }
}
