import javax.swing.*;
import java.awt.*;

public class JanelaSessoes extends JFrame {
    private JButton adicionarButton;
    private JButton removerButton;
    private JPanel painelPrincipal;
    private JList<String> list1;
    private JList list2;
    private JButton voltarAoMenuPrincipalButton;

    private DefaultListModel<String> listModel;
    private DefaultListModel<String> headerModel;

    public JanelaSessoes(String title) {
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


        headerModel.addElement(String.format("%-25s %-20s %-15s %-10s %-10s %-15s",
                "Filme", "Categoria", "Horario", "Formato", "Idade", "Sala"));

        addSession("Inception", "Sci-Fi", "10:00", "2D", "12+", "Sala 1");
        addSession("Skyfall", "Ação", "12:00", "2D", "12+", "Sala 2");
        addSession("John Wick", "Ação", "13:00", "2D", "12+", "Sala 3");
        addSession("Prisoners ", "Aventura", "15:00", "2D", "10+", "Sala 4");
        addSession("The Shawshank Redemption", "Drama", "16:00", "2D", "12+", "Sala 3");
        addSession("Se7en", "Aventura", "17:30", "2D", "8+", "Sala 2");
        addSession("Interstellar", "Sci-Fi", "18:00", "2D", "10+", "Sala 3");
        addSession("Blade Runner 2049", "Ação", "18:30", "3D", "12+", "Sala 2");
        addSession("The Godfather", "Ação", "19:00", "2D", "18+", "Sala 3");
        addSession("Pulp Fiction", "Ação", "20:00", "2D", "16+", "Sala 1");
        addSession("Coco", "Animação", "21:00", "3D", "4+", "Sala 2");
        addSession("Spirited Away", "Aventura", "22:00", "3D", "13+", "Sala 3");

        setContentPane(painelPrincipal);
        pack();
    }

    private void addSession(String filme, String categoria, String horario, String formato, String idade, String sala) {
        String formatted = String.format("%-29s %-23s %-18s %-11s %-11s %-8s", filme, categoria, horario, formato, idade, sala);
        listModel.addElement(formatted);
    }

    public static void main(String[] args) {
        new JanelaSessoes("Lista Sessões").setVisible(true);
    }
}
