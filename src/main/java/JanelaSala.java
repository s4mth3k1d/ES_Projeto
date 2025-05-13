import javax.swing.*;

public class JanelaSala extends JFrame {
    private JPanel painelSala;

    public JanelaSala(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelSala);
        pack();
    }
    public static void main(String[] args) {
        new JanelaSala("Gestão das Salas").setVisible(true);
    }

}
