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

        addSession("Inception", "Sci-Fi", "12+");
        addSession("Skyfall", "Ação", "12+");
        addSession("John Wick", "Ação", "16+");
        addSession("Prisoners ", "Aventura", "16+");
        addSession("The Shawshank Redemption", "Drama", "16+");
        addSession("Se7en", "Aventura", "16+");
        addSession("Interstellar", "Sci-Fi", "10+");
        addSession("Blade Runner 2049", "Ação", "8+");
        addSession("The Godfather", "Ação", "18+");
        addSession("Pulp Fiction", "Ação", "18+");
        addSession("Coco", "Animação", "4+");
        addSession("Spirited Away", "Aventura", "6+");

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
