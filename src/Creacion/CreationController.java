/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creacion;

import java.util.ArrayList;

/**
 *
 * @author mauri
 */
public class CreationController {

    PantallaCreacion pantallaCreacion;
    CreationDataModel creationDataModel = new CreationDataModel();
    
    CreationController(PantallaCreacion view) {
        ArrayList<Categoria> a = new ArrayList<>();
        this.pantallaCreacion = view;
        
    }
    
    public ArrayList<Categoria> getCategorias(){
        return creationDataModel.getCategorias();
    }
    
    public ArrayList<TipoEquipo> getTipoEquipos(){
        return creationDataModel.getTipoEquipos();
    }
    
    public ArrayList<Refrigerante> getRefrigerantes(){
        return creationDataModel.getRefrigerantes();
    }
    
    public ArrayList<Capacidad> getCapacidades(){
        return creationDataModel.getCapacidades();
    }
    
    public boolean addVentilador(Ventilador ventilador){
        return creationDataModel.addVentilador(ventilador);
    }
}
