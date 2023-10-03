package com.example.dto;


/**
 * Clase para transferir del objeto Curso a Formacion
 * 
 * @param cod_curso
 * @param nombre
 * @param precio
 * @param duracion
 */
public class CursoDTO {
    private int cod_curso;
    private String nombre;
    private int precio;
    private int duracion;
    public CursoDTO() {
    }
    public CursoDTO(int cod_curso, String nombre, int precio, int duracion) {
        this.cod_curso = cod_curso;
        this.nombre = nombre;
        this.precio = precio;
        this.duracion = duracion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
}
