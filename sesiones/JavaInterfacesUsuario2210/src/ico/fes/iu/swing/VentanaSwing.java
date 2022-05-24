/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu.swing;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author alan
 */
public class VentanaSwing extends JFrame{
 private FlowLayout layout;
 private JTextField textocuadro;
 private JButton boton1;
 private JLabel resultado;
 //Default ComboBox
 private JComboBox<String> lista;
    public VentanaSwing() {
   
    this.setTitle("Mi ventana swing");
    this.setSize(300,200);
    //this.setVisible(true);
    layout=new FlowLayout();
    this.setLayout(layout);
    textocuadro=new JTextField(15);
   
    boton1= new JButton("Convertir a F");
    resultado= new JLabel("Grados F:");
    lista = new JComboBox<String>();
    lista.addItem("Rojo");
    lista.addItem("Verde");
    lista.addItem("Blanco");
    lista.addItem("Azul");
    this.getContentPane().add(textocuadro);
    this.getContentPane().add(boton1);
    this.getContentPane().add(resultado);
    this.getContentPane().add(lista);
    this.pack();
    this.setVisible(true);
   // this.repaint();
   //this.validate();
    this.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
        System.exit(0);
       // ((JFrame)e.getSource()).setVisible(false);
        }
    
    });
    this.boton1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            float centigrados=Float.parseFloat(textocuadro.getText());
            float farenheit=(centigrados*(9.0f/5.0f))+32.0f;
            resultado.setText(farenheit+"graados °F");
        }
    
    });
   /* this.lista.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println(e.getExtendedKeyCode());
            System.out.println(e.getKeyCode());
            System.out.println(e.getKeyChar());
        }
    
    });*/
   this.lista.addItemListener(new ItemAdapter() {
        @Override
        public void itemStateChanged(ItemEvent ie) {
            System.out.println("cambio el item");    
            System.out.println(ie.getItem());
        }
        
   
   });
    }
    
}
