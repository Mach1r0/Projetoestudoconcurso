package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TelaQuestao extends JFrame implements ActionListener {
    private JLabel tituloLabel;
    private JLabel enunciadoLabel;
    private JLabel grauDificuldadeLabel;
    private JLabel respostaLabel;
    private JLabel assuntoLabel;
    private JLabel concursoLabel;
    private JLabel provaLabel;
    private JButton respostaButton;

    public TelaQuestao(String nomeMateria, String enunciado, String grauDificuldade, String resposta, String assunto, String concurso, String prova) {
        setTitle(nomeMateria);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel questaoPanel = new JPanel();
        questaoPanel.setLayout(new BoxLayout(questaoPanel, BoxLayout.Y_AXIS));

        tituloLabel = new JLabel(nomeMateria);
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 24));
        tituloLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        questaoPanel.add(tituloLabel);

        enunciadoLabel = new JLabel(enunciado);
        enunciadoLabel.setFont(new Font("Arial", Font.BOLD, 16));
        enunciadoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        questaoPanel.add(enunciadoLabel);

        JPanel informacoesPanel = new JPanel(new GridLayout(4, 2));
        informacoesPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        grauDificuldadeLabel = new JLabel("Grau de Dificuldade: " + grauDificuldade);
        informacoesPanel.add(grauDificuldadeLabel);

        assuntoLabel = new JLabel("Assunto: " + assunto);
        informacoesPanel.add(assuntoLabel);

        concursoLabel = new JLabel("Concurso: " + concurso);
        informacoesPanel.add(concursoLabel);

        provaLabel = new JLabel("Prova: " + prova);
        informacoesPanel.add(provaLabel);

        respostaLabel = new JLabel("Resposta: ");
        informacoesPanel.add(respostaLabel);

        questaoPanel.add(informacoesPanel);

        respostaButton = new JButton("Mostrar Resposta");
        respostaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 respostaLabel.setText("Resposta: " + resposta);
                respostaButton.setEnabled(false);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(respostaButton);
        questaoPanel.add(buttonPanel);

        add(questaoPanel, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                String nomeMateria = "Português";
                String enunciado = "Qual é a capital do Brasil?";
                String grauDificuldade = "Fácil";
                String resposta = "Brasília";
                String assunto = "Capitais";
                String concurso = "ENEM";
                String prova = "2022 CEBRASPE";

                TelaQuestao telaQuestao = new TelaQuestao(nomeMateria, enunciado, grauDificuldade, resposta, assunto, concurso, prova);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
