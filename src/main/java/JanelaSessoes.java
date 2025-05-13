import javax.swing.*;
import java.awt.*;

public class JanelaSessoes extends JFrame {
    private JButton adicionarButton;
    private JButton removerButton;
    private JPanel painelPrincipal;
    private JList<String> list1;
    private JList list2;

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

        addSession("Inception", "Sci-Fi", "10:00", "2D", "13+", "Sala 1");
        addSession("Inception", "Sci-Fi", "10:00", "2D", "13+", "Sala 1");
        addSession("Inception", "Sci-Fi", "10:00", "2D", "13+", "Sala 1");
        addSession("Inception", "Sci-Fi", "10:00", "2D", "13+", "Sala 1");
        addSession("Inception", "Sci-Fi", "10:00", "2D", "13+", "Sala 1");
        addSession("Inception", "Sci-Fi", "10:00", "2D", "13+", "Sala 1");
        addSession("Inception", "Sci-Fi", "10:00", "2D", "13+", "Sala 1");
        addSession("Inception", "Sci-Fi", "10:00", "2D", "13+", "Sala 1");
        addSession("Inception", "Sci-Fi", "10:00", "2D", "13+", "Sala 1");
        addSession("Inception", "Sci-Fi", "10:00", "2D", "13+", "Sala 1");
        addSession("Inception", "Sci-Fi", "10:00", "2D", "13+", "Sala 1");
        addSession("Inception", "Sci-Fi", "10:00", "2D", "13+", "Sala 1");
        addSession("Inception", "Sci-Fi", "10:00", "2D", "13+", "Sala 1");
        addSession("Inception", "Sci-Fi", "10:00", "2D", "13+", "Sala 1");
        addSession("Inception", "Sci-Fi", "10:00", "2D", "13+", "Sala 1");
        addSession("Os condenados de Shawshank", "Sci-Fi", "10:00", "2D", "13+", "Sala 1");

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
