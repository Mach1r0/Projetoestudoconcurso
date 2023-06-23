package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public class Telaquestao extends JFrame {

	public Telaquestao() {
		JTextArea textField = new JTextArea();
		textField.setEditable(false);
		textField.setOpaque(false);
		textField.setFont(textField.getFont().deriveFont(Font.BOLD, 14f));
		textField.setWrapStyleWord(true);
		textField.setLineWrap(true);
		textField.setText("Q01 - CEBRASPE 2022 DF-BRASILIA - PROFESSOR UNB\n"
				+ "UNB - 2022\n"
				+ "Matematica\n"
				+ "Multiplicação\n");
		textField.setBounds(10, 10, 580, 120);
		add(textField);

		JLabel banca = new JLabel("Cebraspe");
		banca.setBounds(10, 140, 300, 20);
		add(banca);

		JLabel dificuldade = new JLabel("Media");
		dificuldade.setBounds(10, 170, 300, 20);
		add(dificuldade);

		JTextArea txtenunciado = new JTextArea(
				"É CORRETO afirmar, acerca do estágio probatório do servidor público:");
		txtenunciado.setBounds(10, 200, 580, 100);
		add(txtenunciado);

		setVisible(true);
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
	}

	public static void main(String[] args) {
		new Telaquestao();
	}
}