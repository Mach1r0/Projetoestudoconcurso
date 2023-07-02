package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TelaQuestaomat extends JFrame implements ActionListener {
    private JLabel tituloLabel;
    private JLabel enunciadoLabel;
    private JLabel grauDificuldadeLabel;
    private JLabel respostaLabel;
    private JLabel assuntoLabel;
    private JLabel concursoLabel;
    private JLabel provaLabel;
    private JButton respostaButton;
    private JLabel binariaLabel;

    public TelaQuestaomat(String nomeMateria, String enunciado, String grauDificuldade,
            String resposta, String assunto, String concurso, String prova, boolean binaria) {
        setTitle(nomeMateria);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Usar layout absoluto para posicionar os componentes manualmente

        setLocationRelativeTo(null);

        binariaLabel = new JLabel("Binária: " + String.valueOf(binaria));
        binariaLabel.setBounds(5, 80, 150, 30);
        add(binariaLabel);

        tituloLabel = new JLabel(nomeMateria);
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 24));
        tituloLabel.setBounds(135, 0, 300, 30);
        tituloLabel.setForeground(new Color(74, 45, 86));
        add(tituloLabel);

        enunciadoLabel = new JLabel(enunciado);
        enunciadoLabel.setFont(new Font("Arial", Font.BOLD, 16));
        enunciadoLabel.setBounds(5, 95, 300, 30);
        add(enunciadoLabel);

        respostaButton = new JButton("Resposta");
        respostaButton.setBounds(5, 130, 100, 20); // Ajuste a posição e o tamanho do botão
        respostaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                respostaLabel.setText("Resposta: " + resposta);
                respostaButton.setEnabled(false);
            }
        });
        add(respostaButton);

        grauDificuldadeLabel = new JLabel("Grau de Dificuldade: " + grauDificuldade);
        grauDificuldadeLabel.setBounds(5, 30, 150, 30);
        add(grauDificuldadeLabel);

        assuntoLabel = new JLabel("Assunto: " + assunto);
        assuntoLabel.setBounds(5, 45, 150, 30);
        add(assuntoLabel);

        concursoLabel = new JLabel("Concurso: " + concurso);
        concursoLabel.setBounds(5, 60, 200, 30);
        add(concursoLabel);

        provaLabel = new JLabel("Prova: " + prova);
        provaLabel.setBounds(170, 30, 150, 30);
        add(provaLabel);

        respostaLabel = new JLabel("Resposta: ");
        respostaLabel.setBounds(10, 150, 150, 30);
        add(respostaLabel);

        pack();
        setVisible(true);
        setSize(400, 300);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                boolean binaria = true;
                String nomeMateria = "Matematica";
                String enunciado = "2+2?";
                String grauDificuldade = "Fácil";
                String resposta = "4";
                String assunto = "adição";
                String concurso = "Servidor público";
                String prova = "2022 CEBRASPE";

                TelaQuestaomat telaQuestao = new TelaQuestaomat(nomeMateria, enunciado, grauDificuldade, resposta, assunto, concurso, prova, binaria);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
