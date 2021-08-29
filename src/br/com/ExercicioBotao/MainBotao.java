package br.com.ExercicioBotao;

import br.com.ExercicioBotao.view.Botao;

import javax.swing.*;

public class MainBotao {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Botao();
            }
        });
    }
}
