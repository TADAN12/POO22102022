/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author alan
 */
public class EventosRaton implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Hola, clic de raton");
    }

    @Override
    public void mousePressed(MouseEvent me) {
        System.out.println("Boton presionado");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println("Boton liberado");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("Cursosr entro al componente");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        System.out.println("El cursor salio del componente");    
    }
    
}
