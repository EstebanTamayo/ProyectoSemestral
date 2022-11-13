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

    public CompararController(PantallaComparar pantallaComparar) {
        this.pantallaComparar = pantallaComparar;
    }

    public ArrayList<VentiladorCompareDTO> getComparaciones() {
        return compararDataModel.getComparaciones();
    }

    void GoItem(int row) {
        PantallaEspecifica p = new PantallaEspecifica();
        p.setIndex(row);
        p.setVisible(true);
        pantallaComparar.dispose();
    }
}
