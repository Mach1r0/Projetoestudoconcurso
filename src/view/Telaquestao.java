package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public class Telaquestao extends JFrame implements ActionListener {

    private JLabel respostaLabel;
    private JButton buttonResposta;

    private JTextArea respostas;

    public Telaquestao() {
        JTextArea cabecario = new JTextArea();
        cabecario.setEditable(false);
        cabecario.setOpaque(false);
        cabecario.setFont(cabecario.getFont().deriveFont(12f));
        cabecario.setText("Q01 - CEBRASPE - 2022 DF-BRASILIA - PROFESSOR UNB\n"
                + "Prova: UNB - 2022\n"
                + "Disciplina: Matematica, Assunto: Multiplicação\n"
                + "Díficuldade: Fácil Binaria: Sim\n");
        cabecario.setBounds(0, 10, 300, 120);
        add(cabecario);

        JTextArea enunciado = new JTextArea();
        enunciado.setEditable(false);
        enunciado.setOpaque(false);
        enunciado.setFont(enunciado.getFont().deriveFont(Font.BOLD, 13f));
        enunciado.setText("O poder disciplinar inclui a seguinte prerrogativa do agente público \n"
                + "competente para exercê-lo:\r\n");
        enunciado.setBounds(0, 85, 500, 120);
        add(enunciado);

        JTextArea respostas = new JTextArea();
        respostas.setEditable(false);
        respostas.setOpaque(false);
        respostas.setFont(respostas.getFont().deriveFont(14f));
        respostas.setText("a) Aplicação de advertência ou suspensão ao servidor sem defesa prévia.\n"
                + "b) Aplicação de penalidade administrativa aos contratados da Administração Pública, ainda que não prevista em Lei.\n"
                + "c) Aplicar penalidades mediante processo administrativo disciplinar.\n"
                + "d) Demitir, sem motivação, servidor estável, na hipótese de perda da confiança.");
        respostas.setBounds(0, 200, 500, 120);
        add(respostas);

        respostaLabel = new JLabel();
        respostaLabel.setFont(respostaLabel.getFont().deriveFont(Font.BOLD, 14f));
        respostaLabel.setBounds(0, 350, 500, 30);
        add(respostaLabel);

        buttonResposta = new JButton("Resposta");
        buttonResposta.setBounds(0, 300, 500, 30);
        buttonResposta.addActionListener(new ActionListener() {
            // metodo pra mostrar a resposta depois que aperta
            @Override
            public void actionPerformed(ActionEvent e) {
                String respostaCorreta = "c) Aplicar penalidades mediante processo administrativo disciplinar.";

                // Exibe a resposta correta
                respostaLabel.setText(respostaCorreta);
            }
        });
        add(buttonResposta);

        setVisible(true);
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(ABORT));
    }

    public static void main(String[] args) {
        new Telaquestao();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
}
