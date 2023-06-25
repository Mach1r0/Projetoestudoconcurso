package view;

import javax.swing.*;

public class Consultaquestao extends JFrame {

    public Consultaquestao() {
        JLabel titulo = new JLabel("Questões");
        titulo.setBounds(20, 20, 100, 200);

        JLabel pesquisa = new JLabel("Pesquise por uma questão:");
        add(titulo);
        setVisible(true);
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
    }

    public static void main(String[] args) {
        Consultaquestao consultaq = new Consultaquestao();
        consultaq.setVisible(true);
    }
}