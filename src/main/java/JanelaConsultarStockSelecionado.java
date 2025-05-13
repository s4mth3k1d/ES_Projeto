import javax.swing.*;

public class JanelaConsultarStockSelecionado extends JFrame {
    private JPanel painelConsultarStockSelecionado;
    private JButton btnVoltarConsultarStock;
    private JButton btnAdicionarStock;

    public JanelaConsultarStockSelecionado(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelConsultarStockSelecionado);
        pack();
    }
    public static void main(String[] args) {
        new JanelaConsultarStockSelecionado("Consultar Stock - Produto").setVisible(true); //Colocar aqui produto selecionado
    }

}
