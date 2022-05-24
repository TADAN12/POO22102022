/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu.swing;

import ico.fes.iu.swing.modelos.ModeloPersonaCombo;
import ico.fes.iu.swing.modelos.Persona;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author alan
 */
public class VentanaPersona extends JFrame {

    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblEdad;
    private JTextField txtEdad;
    private JButton btnAgregar;
    private JComboBox lista;
    private ModeloPersonaCombo modelo;
    private ArrayList info;

    public VentanaPersona() {
        lblNombre = new JLabel("Introduce nombre:");
        txtNombre = new JTextField(15);
        lblEdad = new JLabel("Introduce tu edad;");
        txtEdad = new JTextField(3);
        btnAgregar = new JButton("Agregar");
        lista = new JComboBox<>();

        info = new ArrayList();
        info.add(new Persona("jose", 23));
        info.add(new Persona("pepe", 20));
        info.add(new Persona("maria", 25));

        modelo = new ModeloPersonaCombo(info, "jose");
        lista.setModel(modelo);
        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(lblNombre);
        this.getContentPane().add(txtNombre);
        this.getContentPane().add(lblEdad);
        this.getContentPane().add(txtEdad);
        this.getContentPane().add(btnAgregar);
        this.getContentPane().add(lista);
        this.setSize(400, 300);
        this.validate();
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
        this.lista.addItemListener(new ItemAdapter() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                //    System.out.println((Persona)ie.getItem());    
            }

        });

        this.btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (Validar()) {
                    modelo.agregar(new Persona(txtNombre.getText(), Integer.parseInt(txtEdad.getText())));
                    lista.repaint();
                    borrar();
                } else {
                //    System.out.println("Esta vacio");
                    JOptionPane.showMessageDialog(null, "No puedes dejar vacio los campos", "Error del formulario", JOptionPane.ERROR_MESSAGE);
                }
            }

        });

    }

    public VentanaPersona(JLabel lblNombre, JTextField txtNombre, JLabel lblEdad, JTextField txtEdad, JButton btnAgregar, JComboBox lista, ModeloPersonaCombo modelo, ArrayList info) throws HeadlessException {
        this.lblNombre = lblNombre;
        this.txtNombre = txtNombre;
        this.lblEdad = lblEdad;
        this.txtEdad = txtEdad;
        this.btnAgregar = btnAgregar;
        this.lista = lista;
        this.modelo = modelo;
        this.info = info;
    }

    public void borrar() {
        this.txtNombre.setText("");
        this.txtEdad.setText("");
    }

    public boolean Validar() {
        boolean valido = true;
        if (txtEdad.getText().equals("") || txtNombre.getText().equals("")) {
            valido = false;
        }
        return valido;
    }

}
