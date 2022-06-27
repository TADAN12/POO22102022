/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extnsion;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author alan
 */
public class VentanaInfo extends JFrame {

    public JTextField texto1;
    public JLabel label;
    public FlowLayout layout;
    public JComboBox <String> lista;
    public ArrayList <String> items;
    public Modelo modelo;
    public JButton añadir;   
    public VentanaInfo() throws HeadlessException {
        texto1 = new JTextField(15);
        layout = new FlowLayout();
        modelo = new Modelo();
        lista = new  JComboBox<String>();
        items = new ArrayList();
    
        items.add("Pepe");
        items.add("Maria");
        
        this.setSize(200, 200);
        this.setTitle("Prueba");
        this.setLayout(layout);
        modelo.setDatos(items);
        lista.setModel(modelo);
        this.getContentPane().add(añadir);
        this.getContentPane().add(texto1);
        this.getContentPane().add(lista);
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
            System.exit(0);
            }
        
        });
        this.añadir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            //items.add(texto1.getText());
            //modelo.addNombbre();
           // lista.setModel(modelo);
           
            }
        }); 
    }

}
