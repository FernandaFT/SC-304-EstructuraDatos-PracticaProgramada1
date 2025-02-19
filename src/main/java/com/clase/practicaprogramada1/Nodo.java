/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase.practicaprogramada1;

/**
 *
 * @author fernandafajardo
 */
public class Nodo {
    
    private Libro libro;
    private Nodo sig;

    public Nodo(Libro libro) {
        this.libro = libro;
        this.sig = null;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

}
