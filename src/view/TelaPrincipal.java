package view; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame {

    private JMenuBar barraMenu = new JMenuBar();

    public TelaPrincipal() {
        setTitle("Tela Inicial");

        JMenu concursosMenu = new JMenu("Concursos");
        JMenu questoesMenu = new JMenu("Questões");

        barraMenu.add(concursosMenu);
        barraMenu.add(questoesMenu);

        JMenuItem consulta = new JMenuItem("Consulta concurso");
        JMenuItem cadastrarItem = new JMenuItem("Cadastrar");
        JMenuItem materia1 = new JMenuItem("Português");
        JMenuItem materia2 = new JMenuItem("Matematica");
        JMenuItem materia3 = new JMenuItem("Todas as questões");
        materia1.addActionListener(new MenuActionListener());
        materia2.addActionListener(new MenuActionListener());
        materia3.addActionListener(new MenuActionListener());
        cadastrarItem.addActionListener(new MenuActionListener());
        consulta.addActionListener(new MenuActionListener());


        concursosMenu.add(consulta);
        concursosMenu.add(cadastrarItem);
        questoesMenu.add(materia1);
        questoesMenu.add(materia2);
        questoesMenu.add(materia3);

        setJMenuBar(barraMenu);

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel label = new JLabel(new ImageIcon("imagemcentral.png"));
        panel.add(label);
        getContentPane().add(panel, BorderLayout.CENTER);

        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        TelaPrincipal janela = new TelaPrincipal();
        janela.setVisible(true);
    }

    public class MenuActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuItem menuItem = (JMenuItem) e.getSource();
            if (menuItem.getText().equals("Português")) {
                exibirtelaquestaoPortugues();
            } else if (menuItem.getText().equals("Cadastrar")) {
                exibirTelaCadastrar();
            } else if (menuItem.getText().equals("Todas as questões")) {
                telaconsultaQuestao();
            }
            else if (menuItem.getText().equals("Consulta concurso")) {
                telaconsultaConcurso();
            } else if(menuItem.getText().equals("Matematica")){
                exibirtelaquestaoMatematica();
            }
        }
    }
    
    public void exibirtelaquestaoPortugues(){
        TelaQuestao telaquestao = new TelaQuestao("null", "null", "null", "null", "null", 
        "null", "null", null, null);
        telaquestao.setLocationRelativeTo(null);
        telaquestao.setVisible(true);
    }
    public void exibirtelaquestaoMatematica(){
        TelaQuestao telaquestao1 = new TelaQuestao("null", "null", "null", "null", 
        "null", "null", "null", null, null);
        telaquestao1.setLocationRelativeTo(null);
        telaquestao1.setVisible(true);
    }
    public void telaconsultaConcurso() {
        TelaConsultaConcurso telaconsultadoconcurso = new TelaConsultaConcurso();
        telaconsultadoconcurso.setLocationRelativeTo(null);
        telaconsultadoconcurso.setVisible(true);
    }

    public void exibirTelaCadastrar() {
        TelaCadastroConcurso telaCadastroConcurso = new TelaCadastroConcurso();
        telaCadastroConcurso.setLocationRelativeTo(null);
        telaCadastroConcurso.setVisible(true);
    }

    public void telaconsultaQuestao() {
        TelaConsultaQuestoes telaconsulta = new TelaConsultaQuestoes ();
        telaconsulta.setLocationRelativeTo(null);
        telaconsulta.tela();
    }
}
