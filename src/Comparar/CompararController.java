/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparar;

import Entidades.VentiladorCompareDTO;
import Especifico.PantallaEspecifica;
import java.util.ArrayList;

/**
 *
 * @author mauri
 */
public class CompararController {
    private PantallaComparar pantallaComparar;
    private CompararDataModel compararDataModel = new CompararDataModel();
    private ArrayList<VentiladorCompareDTO> data   = new ArrayList<>();

    public CompararController(PantallaComparar pantallaComparar) {
        this.pantallaComparar = pantallaComparar;
    }

    public ArrayList<VentiladorCompareDTO> getComparaciones() {
        ArrayList<VentiladorCompareDTO> lista   = compararDataModel.getComparaciones();
        data = lista;
        return lista;
    }

    void GoItem(int row) {
        PantallaEspecifica p = new PantallaEspecifica();
        p.setIndex(row);
        p.setVisible(true);
        pantallaComparar.dispose();
    }

    public boolean deleteComparacion(int id) {
        return compararDataModel.deleteComparacion(id);
    }
}
