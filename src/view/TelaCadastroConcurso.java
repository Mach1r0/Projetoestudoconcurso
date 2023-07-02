package view;

import javax.swing.*;

import com.mysql.fabric.xmlrpc.base.Array;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import DAO.ConnectionMVC;
import DAO.ExceptionDAO;
import controler.ControladoraConcurso;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.System.Logger.Level;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Concurso;
import model.Questao;
import DAO.ConnectionMVC;

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
    JTextField txtSalario = new JTextField("0");
    JTextField txtVagas = new JTextField("0");

    JButton Cadastrar = new JButton("Cadastrar");
    JButton Cancelar = new JButton("Cancelar");
    JButton Excluir = new JButton("Excluir");
    JButton Consultar = new JButton("Consultar");
    private int codConcurso = 0;

    public TelaCadastroConcurso() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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
        Excluir.addActionListener(this);
        add(Excluir);

        Cancelar.setBounds(270, 270, 100, 25);
        Cancelar.addActionListener(this);
        add(Cancelar);

        Consultar.setBounds(50, 310, 320, 25);
        Consultar.addActionListener(this);
        add(Consultar);
    
        setVisible(true);
    }

    public void BuscarConcurso(Integer Codconcurso, String nome, String dia, String edital, int vagas, Float salario, String banca) {
        this.txtNome.setText(nome);
        this.txtDia.setText((dia));
        this.txtEdital.setText(edital);
        this.txtVagas.setText(Integer.toString(vagas));
        this.txtSalario.setText(Float.toString(salario));
        this.txtBanca.setText(banca);
    }

    public static void main(String[] args) {
        new TelaCadastroConcurso();
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        Object src = evt.getSource();
        if (src == Cadastrar) {
            cadastrarbutton(evt);
        }
        if (src == Cancelar) {
            Limpa(evt);
        }
        if (src == Excluir) {
            apagarConcurso(evt);;
        }
        if (src == Consultar) {
            telaconsultaConcurso();
        }
        
    }
      public void telaconsultaConcurso() {
        TelaConsultaConcurso telaconsultadoconcurso = new TelaConsultaConcurso();
        telaconsultadoconcurso.setLocationRelativeTo(null);
        telaconsultadoconcurso.setVisible(true);
    }

    public void apagarConcurso(java.awt.event.ActionEvent evt) {
         boolean sucesso = false;
         ControladoraConcurso controladoraConcurso = new ControladoraConcurso();
         try {
             sucesso = controladoraConcurso.apagarConcurso(this.codConcurso);
             if(sucesso) {
                 JOptionPane.showMessageDialog(null,"Concurso apagado");
                 this.Limpa(evt);
             } else {
                 JOptionPane.showMessageDialog(null, "Erro ao apagar Concurso");
             }
         } catch (ExceptionDAO ex) {
             JOptionPane.showMessageDialog(null, "Erro " + ex);
         }
     }

    public void cadastrarbutton(ActionEvent evt) {
        int vagas = Integer.parseInt(txtVagas.getText().trim());
        float salarioFloat = Float.parseFloat(String.valueOf(txtSalario.getText()));
        boolean sucesso = false;
        try {
            ControladoraConcurso controladoraConcurso = new ControladoraConcurso();

            if (this.codConcurso == 0) {
                sucesso = controladoraConcurso.cadastrarConcurso(txtNome.getText(), txtDia.getText(),
                        txtEdital.getText(), vagas, txtBanca.getText(), salarioFloat);
            } else {
                sucesso = controladoraConcurso.alterarConcurso(codConcurso, txtNome.getText(), txtDia.getText(),
                        txtEdital.getText(), vagas, txtBanca.getText(), salarioFloat);
            }

            if (sucesso == true) {
                JOptionPane.showMessageDialog(null, "O cadastro foi realizado com sucesso");
                this.Limpa(evt);
            } else {
                JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }


    public void Limpa(java.awt.event.ActionEvent evt) {
        txtNome.setText("");
        txtDia.setText("");
        txtBanca.setText("");
        txtEdital.setText("");
        txtSalario.setText("0");
        txtVagas.setText("0");
    }
    
}
