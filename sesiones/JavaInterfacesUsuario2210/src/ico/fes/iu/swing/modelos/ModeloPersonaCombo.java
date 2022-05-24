/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu.swing.modelos;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author alan
 */
public class ModeloPersonaCombo implements  ComboBoxModel<Persona> {
    private ArrayList <Persona> data;
    private String selected;

    public ModeloPersonaCombo() {
    }

    public ModeloPersonaCombo(ArrayList<Persona> data, String selected) {
        this.data = data;
        this.selected = selected;
    }

    public ArrayList<Persona> getData() {
        return data;
    }

    public void setData(ArrayList<Persona> data) {
        this.data = data;
    }
/*
    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }
*/
    @Override
    public void setSelectedItem(Object o) {
   selected=((Persona)o).getNombre();
   // selected=((Persona)o).toString();
    }

    @Override
    public Object getSelectedItem() {
      return selected;
              }

    @Override
    public int getSize() {
    return data.size();
    }

    @Override
    public Persona getElementAt(int i) {

      return data.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener ll) {
        
    }

    @Override
    public void removeListDataListener(ListDataListener ll) {
     
    }
    public void agregar(Persona p){
        this.data.add(p);
        //se deberia agregar en base de datos
    }
    public void cargarDatos(){
        this.data=new ArrayList<Persona>();
        this.data.add(new Persona("jesus",33));
        this.data.add(new Persona("maria",32));
        this.data.add(new Persona("jose",31));
    }
 
}
