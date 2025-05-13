import javax.swing.*;

public class MenuPrincipal extends JFrame{
    private JButton salasButton;
    private JButton filmesButton;
    private JButton sessõesButton;
    private JButton barButton;
    private JButton bilheteiraButton;
    private JButton consultasButton;
    private JButton carrinhoButton;
    private JButton sairButton;
    private JPanel painelPrincipal;

    public MenuPrincipal(String title) {
    super(title);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    setContentPane(painelPrincipal);
    pack();
}


public static void main(String[] args) {
    new MenuPrincipal("Menu Principal").setVisible(true);
}
}