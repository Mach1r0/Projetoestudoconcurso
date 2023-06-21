package view;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {

    private JMenuBar barraMenu = new JMenuBar();

    public TelaPrincipal() {
    	
        setTitle("Tela Inicial");

        JMenuItem concursosItem = menuimagem("Concursos", "concursoicon.png");
        JMenuItem questoesItem = menuimagem("Questões", "iconefoda.png");

        concursosItem.setBorder(null);
        questoesItem.setBorder(null);

        barraMenu.add(concursosItem);
        barraMenu.add(questoesItem);

        setJMenuBar(barraMenu);

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel label = new JLabel(new ImageIcon("imagemcentral.png"));
        panel.add(label);

        getContentPane().add(panel, BorderLayout.CENTER);

        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JMenuItem menuimagem(String texto, String caminhoImagem) {
        ImageIcon icone = new ImageIcon(caminhoImagem);
        Image imagemRedimensionada = icone.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaIcon = new ImageIcon(imagemRedimensionada);

        JMenuItem menuItem = new JMenuItem(texto);
        menuItem.setIcon(imagemRedimensionadaIcon);

        return menuItem;
    }

    public static void main(String[] args) {
            TelaPrincipal janela = new TelaPrincipal();
            janela.setVisible(true);
  }
}
