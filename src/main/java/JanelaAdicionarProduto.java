import javax.swing.*;

public class JanelaAdicionarProduto extends JFrame {
    private JPanel painelAddProduto;
    private JTextArea textNomeProduto;
    private JTextArea textPrecoProduto;
    private JTextArea textQuantidadeProduto;
    private JButton btnCancelarProduto;
    private JButton btnConfirmarProduto;

    public JanelaAdicionarProduto(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelAddProduto);
        pack();
    }
    public static void main(String[] args) {
        new JanelaAdicionarProduto("Adicionar Produto").setVisible(true);
    }

}
