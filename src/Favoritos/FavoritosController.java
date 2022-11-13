/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Favoritos;

import Entidades.VentiladorItemDTO;
import Especifico.PantallaEspecifica;
import java.util.ArrayList;

/**
 *
 * @author mauri
 */
public class FavoritosController {
    private PantallaFavoritos pantallaFavoritos;
    private FavoritosDataModel favoritosDataModel = new FavoritosDataModel();

    public FavoritosController(PantallaFavoritos pantallaFavoritos) {
        this.pantallaFavoritos = pantallaFavoritos;
    }
    
    public ArrayList<VentiladorItemDTO> getVentiladoresFavorites(){
        return favoritosDataModel.getVentiladoresFavorites();
    }

    public void GoItem(int row) {
        PantallaEspecifica p = new PantallaEspecifica();
        p.setIndex(row);
        p.setVisible(true);
        pantallaFavoritos.dispose();
    }
    
    
}
