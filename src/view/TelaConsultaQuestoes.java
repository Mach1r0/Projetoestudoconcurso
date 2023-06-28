package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TelaConsultaQuestoes extends JFrame implements ActionListener {
    private JLabel buscaLabel = new JLabel("Digite a Questao:");
    private JTextField buscaTextField = new JTextField();
    private JButton buscaButton = new JButton("Buscar");
    private JTable concursoTable;
    private Font padraoFonte = new Font("Bodoni MT Condensed", Font.PLAIN, 24);
    private JPanel consultaPanel = new JPanel(null);
    private JPanel tabelaPanel = new JPanel(new GridLayout());

    private DefaultTableModel tableModel = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int linha, int coluna) {
            return false;
        }
    };

    private void tela() {
        // Configurações da janela
        setTitle("Consulta de Questao");
        setBounds(320, 120, 960, 640);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(new Color(30, 30, 30));
        setLayout(null);

        // Configurações do rótulo de busca
        buscaLabel.setFont(padraoFonte);
        Dimension buscaSize = buscaLabel.getPreferredSize();
        buscaLabel.setBounds(30, 40, buscaSize.width, buscaSize.height);
        add(buscaLabel);

        // Configurações do campo de texto de busca
        buscaTextField.setBounds(230, 40, 380, 30);
        buscaTextField.setFont(padraoFonte);
        add(buscaTextField);

        // Configurações do botão de busca
        buscaButton.setBounds(630, 40, 150, 32);
        buscaButton.setFont(padraoFonte);
        buscaButton.addActionListener(this::buscarButton);
        add(buscaButton);

        // Configurações da tabela
        tableModel.addColumn("Nome");
        tableModel.addColumn("Dificuldade");
        tableModel.addColumn("Resposta");
        tableModel.addColumn("Enunciado");
        tableModel.addColumn("Assunto");
        tableModel.addColumn("Concurso");
        tableModel.addColumn("Prova");

        concursoTable = new JTable(tableModel);
        concursoTable.setRowHeight(40);
        concursoTable.getTableHeader().setFont(padraoFonte);
        concursoTable.setFont(padraoFonte);
        concursoTable.setBackground(new Color(220, 220, 220));

        // Configurações do painel da tabela
        tabelaPanel.setBounds(100, 100, 760, 350);
        tabelaPanel.setFont(padraoFonte);
        tabelaPanel.add(new JScrollPane(concursoTable));
        add(tabelaPanel);

        // Configurações do painel principal
        consultaPanel.setBounds(30, 100, 890, 480);
        consultaPanel.setBackground(new Color(150, 150, 150));
        consultaPanel.add(tabelaPanel);
        consultaPanel.add(buscaLabel);
        consultaPanel.add(buscaTextField);
        consultaPanel.add(buscaButton);
        add(consultaPanel);

        // Exibe a janela
        setVisible(true);
    }

    public void buscarButton(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Consulta de questao realizada.");
    }

    public static void main(String[] args) {
        TelaConsultaConcurso telaConsultaConcurso = new TelaConsultaConcurso();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
