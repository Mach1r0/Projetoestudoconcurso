package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controler.ControladoraConcurso;
import model.Concurso;

public class TelaConsultaConcurso extends JFrame implements ActionListener {
    private JLabel buscaLabel = new JLabel("Digite o Concurso:");
    private JTextField buscaTextField = new JTextField();
    private JButton buscaButton = new JButton("Buscar");
    private JTable concursoTable;
    private Font padraoFonte = new Font("Bodoni MT Condensed", Font.PLAIN, 24);
    private JPanel consultaPanel = new JPanel(null);
    private JPanel tabelaPanel = new JPanel(new GridLayout());
    TelaCadastroConcurso telaCadastroConcurso = new TelaCadastroConcurso();

    private DefaultTableModel tableModel = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int linha, int coluna) {
            return false;
        }
    };

    public TelaConsultaConcurso() {
        tela();
    }

    public TelaConsultaConcurso(TelaCadastroConcurso telaCadastroConcurso) {
        this.telaCadastroConcurso = telaCadastroConcurso;
        tela();
    }

    private void tela() {
        // Configurações da janela
        setTitle("Consulta de Concurso");
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

    public void buscarButton(ActionEvent evt) {
        String nome = buscaTextField.getText();
        DefaultTableModel tableModel = (DefaultTableModel) concursoTable.getModel();
        tableModel.setRowCount(0);
        ControladoraConcurso controladoraConcurso = new ControladoraConcurso();
        try {
            ArrayList<Concurso> concursos = controladoraConcurso.listaConcursos(nome);
            concursos.forEach((Concurso concurso) -> {
                tableModel.addRow(new Object[] {
                        concurso.getCodConcurso(),
                        concurso.getNome(),
                        concurso.getDia(),
                        concurso.getEdital(),
                        concurso.getVagas(),
                        concurso.getSalario(),
                        concurso.getBanca()
                });
            });
            tableModel.fireTableDataChanged();
        } catch (Exception e) {
            Logger.getLogger(TelaCadastroConcurso.class.getName()).log(Level.SEVERE, null, e);
        }
        concursoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableModelMouseclicked(evt);
            }
        });

    }

    public static void main(String[] args) {
        TelaConsultaConcurso telaConsultaConcurso = new TelaConsultaConcurso();
    }

    private void tableModelMouseclicked(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 2) {
            int selectedRow = concursoTable.getSelectedRow();
            Integer codConcurso = (Integer) tableModel.getValueAt(selectedRow, 0);
            String nome = (String) tableModel.getValueAt(selectedRow, 1);
            String dia = (String) tableModel.getValueAt(selectedRow, 2);
            String edital = (String) tableModel.getValueAt(selectedRow, 3);
            Integer vagas = (Integer) tableModel.getValueAt(selectedRow, 4);
            Float salario = (Float) tableModel.getValueAt(selectedRow, 5);
            String banca = (String) tableModel.getValueAt(selectedRow, 6);

            this.telaCadastroConcurso.BuscarConcurso(codConcurso, nome, dia, edital, vagas, salario,
                    banca);
            this.telaCadastroConcurso.setVisible(true);
            this.dispose();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}