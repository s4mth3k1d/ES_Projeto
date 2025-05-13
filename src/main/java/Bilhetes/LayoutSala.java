package Bilhetes;

import javax.swing.*;
import java.awt.*;

public class LayoutSala extends JFrame {
    private JPanel painelSala;
    private JPanel painel1;
    private JButton[][] botoes;

    public LayoutSala() {
        setTitle("Layout da sala");
        int nrLinhas = 10;
        int nrColunas = 8;
        botoes = new JButton[nrLinhas][nrColunas];
        painelSala.setLayout(new GridLayout(nrLinhas, nrColunas));

        for (int i = 0; i < nrLinhas; i++) {
            for (int j = 0; j < nrColunas; j++) {
                // Nome do botão: Letra para a linha + número para a coluna
                char letraLinha = (char) ('A' + i);  // A, B, C, ...
                String nomeBotao = letraLinha + String.valueOf(j + 1);  // A1, A2, ...

                botoes[i][j] = new JButton(nomeBotao);
                painelSala.add(botoes[i][j]);
            }
        }


        setContentPane(painel1);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        // Criar a janela na thread de interface gráfica
        new LayoutSala();
    }
}
