/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Especifico;

import Comparar.PantallaComparar;
import Entidades.Ventilador;

/**
 *
 * @author mauri
 */
public class ItemDisplayController {
    private PantallaEspecifica pantallaEspecifica;
    private ItemDisplayDataModel itemDisplayDataModel = new ItemDisplayDataModel();

    public ItemDisplayController(PantallaEspecifica pantallaEspecifica) {
        this.pantallaEspecifica = pantallaEspecifica;
    }
    
    public Ventilador getVentilador(int index){
        return itemDisplayDataModel.getVentilador(index);
    }
    
    public boolean addComparacion(int ventiladorId){
        return itemDisplayDataModel.addComparacion(ventiladorId);
    }
    
    public boolean addFavorito(int favoritoId, boolean isFavorite){
        return itemDisplayDataModel.addFavorito(favoritoId, isFavorite);
    }
    
    public boolean getFavorite(int favoritoId){
        return itemDisplayDataModel.getFavorite(favoritoId);
    }

    void GoComparar() {
        PantallaComparar p = new PantallaComparar();
        p.setVisible(true);
        pantallaEspecifica.dispose();
    }
}
