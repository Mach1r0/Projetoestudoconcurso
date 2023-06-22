package view;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {
	
    private JMenuBar barraMenu = new JMenuBar();

    public TelaPrincipal() {
    	
        setTitle("Tela Inicial");
        
        JMenu concursosMenu = new JMenu("Concursos");
        JMenu questoesMenu = new JMenu("Questões");
        
        barraMenu.add(concursosMenu);
        barraMenu.add(questoesMenu);

        JMenuItem cadastrarItem = new JMenuItem("Cadastrar");
        JMenuItem editarItem = new JMenuItem("Editar");
        JMenuItem materia1 = new JMenuItem("Português");
        JMenuItem materia2 = new JMenuItem("Matemática");
        JMenuItem materia3 = new JMenuItem("Estrutura de dados");
        
        concursosMenu.add(cadastrarItem);
        concursosMenu.add(editarItem);
        questoesMenu.add(materia1);
        questoesMenu.add(materia3);
        questoesMenu.add(materia2);

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
}
