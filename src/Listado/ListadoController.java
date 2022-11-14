/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listado;

import Entidades.VentiladorItemDTO;
import Especifico.PantallaEspecifica;
import java.util.ArrayList;

/**
 *
 * @author mauri
 */
public class ListadoController {
    
    private ListadoDataModel listadoDataModel = new ListadoDataModel();
    private PantallaLista view;

    public ListadoController(PantallaLista view) {
        this.view = view;
    }
    
    public ArrayList<VentiladorItemDTO> getVentiladoresItems(){
        return listadoDataModel.getVentiladoresItems();
    }

    void GoItem(int row) {
        PantallaEspecifica p = new PantallaEspecifica();
        p.setIndex(row);
        p.setVisible(true);
        view.dispose();
    }

    public boolean deleteItem(int id) {
        return listadoDataModel.deleteItem(id);
    }
}
