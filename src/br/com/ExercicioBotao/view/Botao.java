package br.com.ExercicioBotao.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botao implements ActionListener {

    private JLabel jLabelResultado;

	public Botao(){
            JFrame container = new JFrame("Exemplo de uso de botão");
            container.setLayout(new FlowLayout());

            container.setSize(400, 100);

            container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JButton jButtonup = new JButton("UP");
            JButton jButtondown = new JButton("DOWN");
            JButton jButtonclean = new JButton("CLEAR");
            JButton jButtonexit = new JButton("EXIT");

            jButtonup.addActionListener(this);
            jButtondown.addActionListener(this);
            jButtonclean.addActionListener(this);
            jButtonexit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(1);
                }
            });

           container.add(jButtonup);
           container.add(jButtondown);
           container.add(jButtonclean);
           container.add(jButtonexit);

           jLabelResultado = new JLabel("Por favor, pressione um botão");

           container.add(jLabelResultado);

           container.setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getActionCommand().equals("UP"))
            jLabelResultado.setText("você pressionou o botâo UP");
        else if (actionEvent.getActionCommand().equals("DOWN"))
            jLabelResultado.setText("você pressionou o botâo DOWN");
        else
            jLabelResultado.setText("");

    }
}

