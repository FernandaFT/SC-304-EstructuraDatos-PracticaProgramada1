/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase.practicaprogramada1;

/**
 *
 * @author fernandafajardo
 */
public class Pila {
    
    private Nodo top;
    
    public Pila() {
        top = null;
    }

    public Nodo getTop() {
        return top;
    }
    
    public void setTop(Nodo top) {
        this.top = top;
    }
    
    /**
     * Agrega un nuevo libro a la pila.
     * @param libro El libro que se añadirá a la pila.
     */
    public void push(Libro libro){  
        
        Nodo miNodo = new Nodo(libro);
        if(isEmpty()){
            top = miNodo;
        }else{
            miNodo.setSig(top);
            top = miNodo;
        }
    }
    
    /**
     * Elimina y devuelve el libro en el top de la pila.
     * @return El libro estaba en el top de la pila, o {@code null} si la pila esta vacía.
     */
    public Libro pop(){
        
        if(isEmpty()){
            System.out.println("Error: la pila esta vacía, no puede desapilar");
            return null;
        }else{
            Libro aux = top.getLibro();
            top = top.getSig();
            return aux;
        }
    }

    /**
     * Verifica si la pila esta vacía.
     * @return {@code true} si la pila no tiene elementos, {@code false} en caso contrario.
     */
    public boolean isEmpty(){
        
        if(top == null){
            return true;
        }else{
           return false;
        }
    }
    
    /**
     * Imprime en consola los libros almacenados en la pila en formato JSON.
     * Si la pila está vacía, muestra un mensaje indicándolo.
     */
    public void print(){
        
        if(isEmpty()){
            System.out.println("La pila esta vacía.");
        }else{
            Nodo actual = top;
            System.out.println("[");
            while(actual != null){
                System.out.println(actual.getLibro());
                actual = actual.getSig();
            }
            System.out.println("]");
        }
    }
}
