/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listado;

import Creacion.CreationDataModel;
import Entidades.Capacidad;
import Entidades.Categoria;
import Entidades.Refrigerante;
import Entidades.TipoEquipo;
import Entidades.Ventilador;
import Entidades.VentiladorItemDTO;
import Especifico.PantallaEspecifica;
import java.util.ArrayList;

/**
 *
 * @author mauri
 */
public class ListadoController {
    
    private ListadoDataModel listadoDataModel = new ListadoDataModel();
    private CreationDataModel creationDataModel = new CreationDataModel();
    private PantallaLista view;

    public ListadoController(PantallaLista view) {
        this.view = view;
    }
    
    public ArrayList<VentiladorItemDTO> getVentiladoresItems(){
        return listadoDataModel.getVentiladoresItems();
    }

    public void GoItem(int row) {
        PantallaEspecifica p = new PantallaEspecifica();
        p.setIndex(row);
        p.setVisible(true);
        view.dispose();
    }

    public boolean deleteItem(int id) {
        return listadoDataModel.deleteItem(id);
    }
    
    public ArrayList<Ventilador> getVentiladorFilter(String filter){
        return listadoDataModel.getVentiladorFilter(filter);
    }
    
    public ArrayList<TipoEquipo> getTipoEquipos(){
        return creationDataModel.getTipoEquipos();
    }
    
    public ArrayList<Categoria> getCategorias(){
        return creationDataModel.getCategorias();
    }
    
    public ArrayList<Refrigerante> getRefrigerantes() {
        return creationDataModel.getRefrigerantes();
    }
    
    public ArrayList<Capacidad> getCapacidades() {
        return creationDataModel.getCapacidades();
    }
    
    public ArrayList<String> getModelos(){
        return listadoDataModel.getModelos();
    }
    
    public ArrayList<String> getMarcas(){
        return listadoDataModel.getMarcas();
    }
}
