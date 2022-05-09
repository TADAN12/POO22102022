/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author alan
 */
public class MiVentanavs2 extends Frame {
    private Button boton1;
    private FlowLayout layout;
    private TextField textoc;
    private Label etiqueta;
    //private EventosRaton raton;
    public MiVentanavs2() throws HeadlessException {
        setTitle("Mi ventana version 2");
        setSize(300,200);
        layout=new FlowLayout();
        setLayout(layout);
        boton1=new Button("saludar");
        textoc=new TextField(15);
        etiqueta=new Label("valor inicial");
       // raton=new EventosRaton();
        this.boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               etiqueta.setText("Hola "+textoc.getText()+":)");
                System.out.println("X="+e.getX());
                System.out.println("Y="+e.getY());
                System.out.println("Que boton se presiono:"+e.getButton());
            }
        
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
            System.exit(0);
            }
        
        });
        this.textoc.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
              //  System.out.println("Tecla:"+e.getKeyChar());    
            //    System.out.println("%X"+e.getKeyCode());    
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        System.out.println("Se dio enter");
                        break;
                    default:
                        System.out.println("Tecla:"+e.getKeyChar());
                }
            }
        
        });
        this.add(textoc);
        this.add(boton1);
        this.add(etiqueta);
        setVisible(true);
            
    }

  
    
}
