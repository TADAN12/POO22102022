/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodificacionTexto;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author alan
 */
public class CodificarTexto extends JFrame {

    private FlowLayout layout;
    private JButton cod, uncod;
    private JTextField textouncod, textocod,numRecorrer;
    private JLabel mensaje, mensaje2, msj3;

    public CodificarTexto() {

        this.setTitle("Codificacion Cesar");
        this.setSize(400, 400);

        layout = new FlowLayout();
        this.setLayout(layout);
        cod = new JButton("Codifocar texto.");
        uncod = new JButton("Descodificar texto\n");
        textouncod = new JTextField(15);
        textocod = new JTextField(15);
        numRecorrer= new JTextField(3);
        mensaje = new JLabel("Texto a codificar:");
        mensaje2 = new JLabel("Texto a descodificar:");
        msj3 =new JLabel("Numero de caracteres a recorrer:");
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.cod.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                char num[];
                num = (numRecorrer.getText()).toCharArray();
                /***
                 +Por practica intente sustitur la conversion  a enterio "ParsetoInt()"
                 * int b=Integer.parseInt(num);
                 * En ves de elllo, hice la conversión por las piedritas usando ascii
                 ****/
                int tamanio=num.length;
                int numsf;//numero de movimientos de caracteres
                char string[] = (textouncod.getText()).toCharArray();
                String converted = "";
                switch (tamanio) 
                { 
                    case 1:   numsf=(num[0]-48); 
                              break;
                    case 2: numsf=(num[0]-48)*10+(num[1]-48);
                            break;
                    default: System.out.println("Numeros fuera de rango.(Dos numeros como maximo)");
                            return;
                }
                // termina la conversion de entero por asscii.
                if(numsf<1||numsf>26){
                    System.out.println("Numero fuera de rango:(1-26)");
                    return;
                }
                for (int i = 0; i < string.length; i++)  //inicia la codificación
                {
                    int charToint = string[i];
                   if(charToint>63 & charToint<92) //Aplica reglas para MAYUSC
                   {
                        if (!Character.isWhitespace(string[i])) 
                        charToint = (((string[i] - 65) + numsf) % 26 + 65);
                     else 
                        charToint = string[i];
                   }
                   if(charToint>96 & charToint <123)  //Aplica Reglas para minusculas
                   {
                        if (!Character.isWhitespace(string[i])) //codifica 
                        charToint = (((string[i] - 97) + numsf) % 26 + 97);
                     else 
                        charToint = string[i]; //es espacio, no codifiques
                   }
                    
                    converted +=(char)charToint; //Cadena codificada
                }
                textocod.setText(converted);
            }
        });
        
        this.uncod.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                char string[] = (textocod.getText()).toCharArray();
                char num[];
                num=(numRecorrer.getText()).toCharArray();
                int tamanio=num.length,numsf;
                String converted = "";
                  switch (tamanio) {
                    case 1:
                        numsf=(num[0]-48); 
                        break;
                    case 2:
                        numsf=(num[0]-48)*10+(num[1]-48);
                        break;
                    default:
                        System.out.println("Numeros fuera de rango.(Dos numeros como maximo)");
                        return;
                }
                if(numsf<1||numsf>26){
                    System.out.println("Numero fuera de rango:(1-26)");
                    return;
                }
                for (int i = 0; i < string.length; i++) {
                    int charToint=string[i];
                    if(charToint>64 & charToint<92){
                        if (!Character.isWhitespace(string[i])) 
                            if (charToint - numsf < 65)
                                charToint = (91 - (63 - (charToint - numsf)));
                            else 
                                charToint = charToint - numsf; 
                        else 
                            charToint = string[i];
                        converted += (char)charToint;
                        }
                    if(charToint>96 & charToint<123){
                        if (!Character.isWhitespace(string[i])) 
                            if (charToint - numsf < 97)
                                charToint = (122 - (96 - (charToint - numsf)));
                            else 
                                charToint = charToint - numsf;
                        
                        else 
                            charToint = string[i];
                        converted += (char)charToint;
                
                    }
                }
                textouncod.setText(converted);
            }
        });
        this.getContentPane().add(msj3);
        this.getContentPane().add(numRecorrer);
        this.getContentPane().add(mensaje);
        this.getContentPane().add(mensaje2);
        this.getContentPane().add(textouncod);
        this.getContentPane().add(textocod);
        this.getContentPane().add(cod);
        this.getContentPane().add(uncod);

        this.setVisible(true);
    }

}
