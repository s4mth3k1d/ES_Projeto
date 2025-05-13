import javax.swing.*;

public class AddFilme extends JFrame{
    private JTextField textField1;
    private JComboBox comboBox1;
    private JTextField textField2;
    private JButton cancelarButton;
    private JButton confirmarButton;
    private JRadioButton a2DRadioButton;
    private JRadioButton a3DRadioButton;
    private JPanel painelPrincipal;

    public AddFilme(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        comboBox1.addItem("Ação ");
        comboBox1.addItem("Aventura");
        comboBox1.addItem("Drama");
        comboBox1.addItem("Romance");
        comboBox1.addItem("Sci-Fi");
        comboBox1.addItem("Animação");
        comboBox1.addItem("Documentário");
        comboBox1.addItem("Thriller");
        comboBox1.addItem("Comédia");

        setContentPane(painelPrincipal);
        pack();
    }
    public static void main(String[] args) {
        new AddFilme("Adicionar Filme").setVisible(true);
    }
}
