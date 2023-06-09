package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import model.Matematica;
import model.Portugues;

public class TelaConsultaQuestoes extends JFrame implements ActionListener {

    private JLabel buscaLabel = new JLabel("Digite a Questao:");
    private JTextField buscaTextField = new JTextField();
    private JButton buscaButton = new JButton("Buscar");
    private JTable concursoTable;
    private Font padraoFonte = new Font("Bodoni MT Condensed", Font.PLAIN, 24);
    private JPanel consultaPanel = new JPanel(null);
    private JPanel tabelaPanel = new JPanel(new GridLayout());
    private ArrayList<Portugues> listaportugues = new ArrayList<>(); // Lista de questões de Portugues
    private ArrayList<Matematica> listamatematica = new ArrayList<>(); // Lista de questões

    private DefaultTableModel tableModel = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int linha, int coluna) {
            return false;
        }
    };

    public void tela() {
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
        buscaButton.addActionListener(this);
        add(buscaButton);

        // Configurações da tabela
        tableModel.addColumn("Nome");
        tableModel.addColumn("Assunto");
        tableModel.addColumn("Concurso");
        tableModel.addColumn("Prova");
        tableModel.addColumn("Enunciado");
        tableModel.addColumn("Grau de dificuldade");
        tableModel.addColumn("resposta");
        tableModel.addColumn("Binaria");
        tableModel.addColumn("Discussiva");

        concursoTable = new JTable(tableModel);
        concursoTable.setRowHeight(40);
        concursoTable.getTableHeader().setFont(padraoFonte);
        concursoTable.setFont(padraoFonte);
        concursoTable.setBackground(new Color(220, 220, 220));

        // Configurações do painel da tabela
        tabelaPanel.setBounds(30, 100, 850, 350);
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

        concursoTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { // Verifica se foi um duplo clique
                    int rowIndex = concursoTable.getSelectedRow(); // Obtém o índice da linha selecionada
                    // Obtém os valores da linha selecionada
                    String nomeMateria = (String) tableModel.getValueAt(rowIndex, 0);
                    String assunto = (String) tableModel.getValueAt(rowIndex, 1);
                    String concurso = (String) tableModel.getValueAt(rowIndex, 2);
                    String prova = (String) tableModel.getValueAt(rowIndex, 3);
                    String graudedificuldade = (String) tableModel.getValueAt(rowIndex, 4);
                    String resposta = (String) tableModel.getValueAt(rowIndex, 5);
                    String binariaStr = (String) tableModel.getValueAt(rowIndex, 6);
                    boolean binaria = Boolean.parseBoolean(binariaStr);
                    String discussiva= (String) tableModel.getValueAt(rowIndex, 7);
                    // Exibe a nova tela de questão
                    exibirTelaQuestao(nomeMateria, assunto, concurso, prova, graudedificuldade, 
                    resposta, resposta, binaria,discussiva);
                }
            }
        });

        // Exibe a janela
        setVisible(true);
    }

    public void adicionaPortugues(Portugues portugues) {
        listaportugues.add(portugues);
        String[] rowportugues = {
                portugues.getNomeMateria(),
                portugues.getAssunto(),
                portugues.getConcurso(),
                portugues.getProva(),
                portugues.getGraudedificuldade(),
                portugues.getResposta(),
                portugues.getQuestoesDiscursivas(),
                portugues.getEnunciado(),
        };
        tableModel.addRow(rowportugues);
    }

    public void adicionaMatematica(Matematica matematica) {
        listamatematica.add(matematica);
        String[] rowmatematica = {
                matematica.getNomeMateria(),
                matematica.getAssunto(),
                matematica.getConcurso(),
                matematica.getProva(),
                matematica.getGraudedificuldade(),
                matematica.getResposta(),
                String.valueOf(matematica.getQuestoesBinarias()),
                matematica.getEnunciado(),
        };
        tableModel.addRow(rowmatematica);
    }

        public void buscarMatematica(String termo) {
        for (Matematica matematica : listamatematica) {
            if (matematica.getNomeMateria().contains(termo)) {
                String[] rowmatematica = {
                    matematica.getNomeMateria(),
                    matematica.getAssunto(),
                    matematica.getConcurso(),
                    matematica.getProva(),
                    matematica.getGraudedificuldade(),
                    matematica.getResposta(),
                    matematica.getEnunciado(),
                    String.valueOf(matematica.getQuestoesBinarias())
                };
                tableModel.addRow(rowmatematica);
            }
        }
    }


    public void buscarPortugues(String termo) {
        for (Portugues portugues : listaportugues) {
            if (portugues.getNomeMateria().contains(termo)) {
                String[] rowportugues = {
                    portugues.getNomeMateria(),
                    portugues.getAssunto(),
                    portugues.getConcurso(),
                    portugues.getProva(),
                    portugues.getGraudedificuldade(),
                    portugues.getResposta(),
                    portugues.getQuestoesDiscursivas(),
                    portugues.getEnunciado(),
                };
                tableModel.addRow(rowportugues);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buscaButton) {
            String termo = buscaTextField.getText();
            tableModel.setRowCount(0); // Limpar todas as linhas antes de realizar a busca
            buscarPortugues(termo);
            buscarMatematica(termo);
        }
    }


    public void exibirTelaQuestao(String nomeMateria, String assunto, String concurso, String prova, 
    String Enunciado, String resposta, String graudedificuldade, boolean binaria, String discussiva) {
        
        TelaQuestao telaQuestao = new TelaQuestao(nomeMateria, assunto, concurso, resposta,
        graudedificuldade,Enunciado,prova, binaria, discussiva);
        telaQuestao.setVisible(true);
    }

   public static void main(String[] args) {
    TelaConsultaQuestoes tela1 = new TelaConsultaQuestoes();
    tela1.tela();
    tela1.adicionaPortugues(new Portugues("portugues", "Fácil", "Portugues", "Facil", "Titulo", 
    "Enunciado", "Resposta", "Assunto"));
    tela1.adicionaMatematica(new Matematica("Matematica", "Multiplicação", 
    "Ministerio Fazenda", "Ministerio Fazenda", true, "Resposta", "title", "title"));

    }
}
