package anna.dcx.ufpb.br.agenda;

import javax.swing.*;
import java.awt.*;

public class AgendaAnnaV2  extends JFrame {
    JLabel linha1,linha2;
    ImageIcon boloImg = new ImageIcon("./imgs/bolo.jpg");
    public AgendaAnnaV2() {
        setTitle("Agenda de Aniversários");
        setSize(400, 400);
        setLocation(150, 150);
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);
        linha1 = new JLabel("Minha agenda de Aniversários", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        linha2 = new JLabel(boloImg, JLabel.CENTER);
        getContentPane().setLayout(new GridLayout(3, 1));
        getContentPane().add(linha1);
        getContentPane().add(linha2);
    }

    public static void main(String[] args) {
        JFrame janela = new AgendaAnnaV2();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
