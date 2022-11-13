/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author mauri
 */
public class Ventilador {
    private String codigo;
    private String categoria;
    private Integer capacidad;
    private String tipoEquipo;
    private Integer espacioMaximo;
    private String marca;
    private String modelo;
    private boolean controlRemoto;
    private boolean instalacion;
    private Integer precio;
    private Integer ancho;
    private Integer alto;
    private String descripcion;
    private String refrigerante;

    public Ventilador() {
    }
    
    public Ventilador(String codigo, String categoria, Integer capacidad, String tipoEquipo, Integer espacioMaximo, String marca, String modelo, boolean controlRemoto, boolean instalacion, Integer precio, Integer ancho, Integer alto, String descripcion, String refrigerante) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.capacidad = capacidad;
        this.tipoEquipo = tipoEquipo;
        this.espacioMaximo = espacioMaximo;
        this.marca = marca;
        this.modelo = modelo;
        this.controlRemoto = controlRemoto;
        this.instalacion = instalacion;
        this.precio = precio;
        this.ancho = ancho;
        this.alto = alto;
        this.descripcion = descripcion;
        this.refrigerante = refrigerante;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public Integer getEspacioMaximo() {
        return espacioMaximo;
    }

    public void setEspacioMaximo(Integer espacioMaximo) {
        this.espacioMaximo = espacioMaximo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public boolean isInstalacion() {
        return instalacion;
    }

    public void setInstalacion(boolean instalacion) {
        this.instalacion = instalacion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRefrigerante() {
        return refrigerante;
    }

    public void setRefrigerante(String refrigerante) {
        this.refrigerante = refrigerante;
    }
}
