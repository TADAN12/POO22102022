/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu.swing.modelos;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
// Los metodos de esta clase sera invocados de forma automatica por el objeto de la VISA, como
// en este caso un JComboBox
//Nosotros como programoadores le proporcionaremos la informacio que requiere la vista para
//mostrarle la informacion al usiario
/**
 *
 * @author alan
 */
public class NombresComboModelo  implements ComboBoxModel<String>{
    private ArrayList<String> datos;
    private String selectedItem;

    public NombresComboModelo() {
    }
//sobrecargado
    public NombresComboModelo(ArrayList<String> datos, String slectedItem) {
        this.datos = datos;
        this.selectedItem = slectedItem;
    }


    public ArrayList<String> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<String> datos) {
        this.datos = datos;
    }
// Metodos abstractos
    @Override
    public void setSelectedItem(Object o) {
       this.selectedItem=(String) o; 
        System.out.println("--"+o);
    }

   // @Override
   // public Object getSelectedItem() {}

    @Override
    public int getSize() {
    return datos.size();    
    }

    @Override
    public String getElementAt(int i) {
     return datos.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener ll) {
        
    }

    @Override
    public void removeListDataListener(ListDataListener ll) {
    
    }

    @Override
    public Object getSelectedItem() {
    return this.selectedItem;
    }
  
    
}
