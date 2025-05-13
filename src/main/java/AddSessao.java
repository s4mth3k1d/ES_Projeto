import javax.swing.*;

public class AddSessao extends JFrame {

    private JComboBox comboBox1;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox2;
    private JButton cancelarButton;
    private JButton confirmarButton;
    private JPanel painelPrincipal;


    public AddSessao(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        comboBox1.addItem("Inception ");
        comboBox1.addItem("Skyfall ");
        comboBox1.addItem("John Wick");

        comboBox2.addItem("Sala 1");
        comboBox2.addItem("Sala 2");
        comboBox2.addItem("Sala 3");

        comboBox1.setSelectedIndex(0);
        comboBox2.setSelectedIndex(0);

        setContentPane(painelPrincipal);
        pack();
    }
    public static void main(String[] args) {
        new AddSessao("Criar Sessão").setVisible(true);
    }
}