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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author alan
 */
public class MiVentana extends Frame implements MouseListener{
    private Button boton1;
    private FlowLayout layout;
    private TextField textoc;
    private Label etiqueta;
    //private EventosRaton raton;
    public MiVentana() throws HeadlessException {
        setTitle("Mi ventana");
        setSize(300,200);
        layout=new FlowLayout();
        setLayout(layout);
        boton1=new Button("saludar");
        textoc=new TextField(15);
        etiqueta=new Label("valor inicial");
       // raton=new EventosRaton();
        this.boton1.addMouseListener(this);
      //  this.etiqueta.addMouseListener(this);
        this.add(textoc);
        this.add(boton1);
        this.add(etiqueta);
        setVisible(true);
            
    }

  @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("clic");
        etiqueta.setText("hola "+textoc.getText());
        System.out.println(textoc.getText());
        System.out.println("--"+me+"--");
    }

    @Override
    public void mousePressed(MouseEvent me) {
        System.out.println("Presionado");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println("Liberado");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("entro");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        System.out.println("Salio");    
    }
    
}
