import javax.swing.*;

public class JanelaAdicionarStock extends JFrame {
    private JPanel painelAdicionarStock;
    private JTextArea textQuantidadeStockProduto;
    private JButton btnConfirmarAddStock;
    private JButton btnCancelarAddStock;

    public JanelaAdicionarStock(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelAdicionarStock);
        pack();
    }
    public static void main(String[] args) {
        new JanelaAdicionarStock("Adicionar stock - Produto").setVisible(true); // colocar o nome do produto
    }
}
