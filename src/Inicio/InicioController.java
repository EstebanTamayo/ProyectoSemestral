/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inicio;

import Entidades.VentiladorItemDTO;
import Especifico.PantallaEspecifica;
import Listado.ListadoDataModel;
import java.util.ArrayList;

/**
 *
 * @author mauri
 */
public class InicioController {
    private PantallaInicio pantallaInicio;
    private ListadoDataModel listadoDataModel = new ListadoDataModel();
    private ArrayList<VentiladorItemDTO> data   = new ArrayList<>();
    private int ventiladoresCount = 0;
    private long instalacionesCount = 0;

    public InicioController(PantallaInicio pantallaInicio) {
        this.pantallaInicio = pantallaInicio;
    }
    
    public ArrayList<VentiladorItemDTO> getVentiladoresItems(){
        ArrayList<VentiladorItemDTO> lista = listadoDataModel.getVentiladoresItems();
        data = lista;
        countProcess();
        return lista;
    }
    
    private void countProcess(){
        ventiladoresCount = data.size();
        instalacionesCount = data.stream().filter((t) -> t.isInstalacion()).count();
    }

    public int getVentiladoresCount() {
        return ventiladoresCount;
    }

    public long getInstalacionesCount() {
        return instalacionesCount;
    }

    public void GoItem(int row) {
        PantallaEspecifica p = new PantallaEspecifica();
        p.setIndex(row);
        p.setVisible(true);
        pantallaInicio.dispose();
    }
}
