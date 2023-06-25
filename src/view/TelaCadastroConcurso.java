package view;

import javax.swing.*;

import controler.ControladoraConcurso;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroConcurso extends JFrame implements ActionListener {

    JLabel Titulo = new JLabel("Cadastro Concurso", SwingConstants.CENTER);
    JLabel nome = new JLabel("Nome:");
    JLabel dia = new JLabel("Dia:");
    JLabel banca = new JLabel("Banca:");
    JLabel edital = new JLabel("Edital:");
    JLabel salario = new JLabel("Salário:");
    JLabel vagas = new JLabel("Vagas:");

    JTextField txtNome = new JTextField();
    JTextField txtDia = new JTextField();
    JTextField txtBanca = new JTextField();
    JTextField txtEdital = new JTextField();
    JTextField txtSalario = new JTextField();
    JTextField txtVagas = new JTextField();

    JButton Cadastrar = new JButton("Cadastrar");
    JButton Cancelar = new JButton("Cancelar");
    JButton Excluir = new JButton("Excluir");
    JButton Consultar = new JButton("Consultar");

    public TelaCadastroConcurso() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(400, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        // Botões
        Titulo.setBounds(50, 20, 300, 20);
        Titulo.setFont(new Font("Arial", Font.BOLD, 20));
        add(Titulo);

        nome.setBounds(50, 70, 100, 20);
        add(nome);
        txtNome.setBounds(120, 70, 200, 20);
        add(txtNome);

        dia.setBounds(50, 100, 100, 20);
        add(dia);
        txtDia.setBounds(120, 100, 200, 20);
        add(txtDia);

        banca.setBounds(50, 130, 100, 20);
        add(banca);
        txtBanca.setBounds(120, 130, 200, 20);
        add(txtBanca);

        edital.setBounds(50, 160, 100, 20);
        add(edital);
        txtEdital.setBounds(120, 160, 200, 20);
        add(txtEdital);

        salario.setBounds(50, 190, 100, 20);
        add(salario);
        txtSalario.setBounds(120, 190, 200, 20);
        add(txtSalario);

        vagas.setBounds(50, 220, 100, 20);
        add(vagas);
        txtVagas.setBounds(120, 220, 200, 20);
        add(txtVagas);

        Cadastrar.setBounds(50, 270, 100, 25);
        Cadastrar.addActionListener(this);
        add(Cadastrar);

        Excluir.setBounds(160, 270, 100, 25);
        add(Excluir);

        Cancelar.setBounds(270, 270, 100, 25);
        add(Cancelar);

        Consultar.setBounds(50, 310, 320, 25);
        add(Consultar);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaCadastroConcurso();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
    	if (src == Cadastrar) {
    		cadastrarConcurso(e);
		}
    }
    public void cadastrarConcurso(java.awt.event.ActionEvent evt) {
    	String nome = txtNome.getText();
    	String dia = txtDia.getText();
    	String edital = txtEdital.getText();
    	int vagas = Integer.parseInt(txtVagas.getText());
    	String banca = txtBanca.getText();
    	float salario = Integer.parseInt(txtSalario.getText());
		boolean sucesso = false; 

		try {
		ControladoraConcurso controladoraConcurso = new ControladoraConcurso();
    	controladoraConcurso.cadastrarConcurso(nome, dia, edital, vagas, banca, salario);
    	
    	if(sucesso == true) {
    		JOptionPane.showMessageDialog(null,"O cadastro foi realizado com sucesso");
    		this.Cancelar(evt);
    	}else {
    		JOptionPane.showMessageDialog(null,"Os campos não foram preenchidos corretamento");
    	}
    }catch (Exception e) {
    	JOptionPane.showMessageDialog(null,"Erro:" + e);
}
    }

	private void Cancelar(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}
    
    
    
}
