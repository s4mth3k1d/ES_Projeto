package Bilhetes;

import javax.swing.*;

public class AlertaErro {
    public static void main(String[] args) {
        // Exibe uma janela de erro com o texto desejado
        JOptionPane.showMessageDialog(
                null,
                "Não há lugares suficientes para esta sessão.",
                "Erro",
                JOptionPane.ERROR_MESSAGE
        );
    }
}
