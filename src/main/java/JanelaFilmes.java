import javax.swing.*;
import java.awt.*;

public class JanelaFilmes extends JFrame{
    private JButton adicionarButton;
    private JButton removerButton;
    private JPanel painelPrincipal;
    private JList<String> list2;
    private JList list1;

    private DefaultListModel<String> listModel;
    private DefaultListModel<String> headerModel;

    public JanelaFilmes(String title) {
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


        headerModel.addElement(String.format("%-25s %-20s %-15s",
                "Titulo do Filme", "Categoria", "Idade"));

        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");
        addSession("Inception", "Sci-Fi", "10+");

        setContentPane(painelPrincipal);
        pack();
    }

    private void addSession(String titulo_filme, String categoria, String idade) {
        String formatted = String.format("%-29s %-23s %-18s ", titulo_filme, categoria, idade);
        listModel.addElement(formatted);
    }

    public static void main(String[] args) {
        new JanelaFilmes("Lista Filmes").setVisible(true);
    }
}
