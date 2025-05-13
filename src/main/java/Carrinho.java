import javax.swing.*;
import java.awt.*;

public class Carrinho extends JFrame {
    private JList list1;
    private JList list2;
    private JButton cancelarButton;
    private JButton pagamentoButton;
    private JButton voltarButton;
    private JPanel painelPrincipal;

    private DefaultListModel<String> listModel;
    private DefaultListModel<String> headerModel;

    public Carrinho(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        listModel = new DefaultListModel<>();
        headerModel = new DefaultListModel<>();

        list1.setModel(listModel);
        list2.setModel(headerModel);

        list1.setFont(new Font("Monospaced", Font.BOLD, 12));
        list2.setFont(new Font("Monospaced", Font.BOLD, 14));
        list2.setEnabled(false);
        list2.setBackground(Color.white);


        headerModel.addElement(String.format("%-52s %-10s", "Artigo", "Preço"));

        addArticle("Pipocas M", "4,50€");
        addArticle("Pipocas S", "4,00€");
        addArticle("Pipocas XL", "5,00€");
        addArticle("Refrigerante ", "2,00€");
        addArticle("Gomas", "3,00€");

        setContentPane(painelPrincipal);
        pack();
    }

    private void addArticle(String artigo, String preco) {
        String formatted = String.format("%-60s %-10s", artigo, preco);
        listModel.addElement(formatted);
    }

    public static void main(String[] args) {
        new Carrinho("Carrinho").setVisible(true);
    }
}
