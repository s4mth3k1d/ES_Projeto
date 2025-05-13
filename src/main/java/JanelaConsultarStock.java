import javax.swing.*;

public class JanelaConsultarStock extends JFrame {
    private JPanel painelConsultarStock;
    private JComboBox comboBox1;
    private JButton btnConfirmarStock;
    private JButton cancelarButton;

    public JanelaConsultarStock(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelConsultarStock);
        pack();
    }
    public static void main(String[] args) {
        new JanelaConsultarStock("Consultar Stock - Produtos").setVisible(true);
    }

}
