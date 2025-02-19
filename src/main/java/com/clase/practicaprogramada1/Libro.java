/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase.practicaprogramada1;

/**
 *
 * @author fernandafajardo
 */
public class Libro {
    
    private String nombreLibro;
    private String autor;
    private String genero;
    private int cantidadPaginas;
    private String fechaPublicacion;

    public Libro() {
    }

    public Libro(String nombreLibro, String autor, String genero, int cantidadPaginas, String fechaPublicacion) {
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.genero = genero;
        this.cantidadPaginas = cantidadPaginas;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

}
