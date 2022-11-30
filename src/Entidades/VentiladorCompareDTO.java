/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author esteb
 */
public class VentiladorCompareDTO {
    private Integer id;
    private String modelo;
    private String marca;
    private String TipoEquipo;
    private String descripcion;
    private Integer precio;

    public VentiladorCompareDTO(Integer id, String modelo, String marca, String TipoEquipo, String descripcion, Integer precio) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.TipoEquipo = TipoEquipo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoEquipo() {
        return TipoEquipo;
    }

    public void setTipoEquipo(String TipoEquipo) {
        this.TipoEquipo = TipoEquipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    
    
}
