package anna.dcx.ufpb.br.agenda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AgendaAnna extends JFrame {
    public AgendaAnna(){
        setTitle("Agenda de Anivrsários!");
        setSize(400,200);
        setLocation(150,150);
        //localização da janela na tela
        setResizable(false);
        //janela não redimensionável
        getContentPane().setBackground(Color.lightGray);
    }


    public static void  main(String[]args){
        JFrame janela = new AgendaAnna();
        janela.setVisible(true);
        WindowListener fechadorDeJanelaPrincipal = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        };
        janela.addWindowListener(fechadorDeJanelaPrincipal);

    }
}
