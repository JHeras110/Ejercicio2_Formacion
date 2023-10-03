package com.example.model;

/**
 * Clase Formacion
 * 
 * @param nombre 
 * @param asignaturas
 * @param precio
 */
public class Formacion {
    private String nombre;
    private int asignaturas;
    private int precio;
    public Formacion() {
    }
    public Formacion(String nombre, int asignaturas, int precio) {
        this.nombre = nombre;
        this.asignaturas = asignaturas;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getAsignaturas() {
        return asignaturas;
    }
    public void setAsignaturas(int asignaturas) {
        this.asignaturas = asignaturas;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
