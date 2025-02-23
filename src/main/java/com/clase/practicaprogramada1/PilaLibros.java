/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase.practicaprogramada1;

/**
 *
 * @author fernandafajardo
 */
public class PilaLibros extends Pila {

    public PilaLibros() {
        super();
    } 
    
    /***
     * Elimina un libro de la pila en la posición indicada.
     * @author Fernanda Fajardo
     * @param posicion La posición del libro que se eliminará de la pila.
     */
    public void eliminaLibro(int posicion){
        
        if (posicion < 0 || posicion >= retornaTamano()) {
            System.out.println("Error: La posición no es válida.");
        } else {
            setTop(recursivoEliminaLibro(getTop(), posicion));
        }
    }
    
    /***
     * Elimina una libro de la pila de manera recursiva en la posición que se le indique.
     * @author Fernanda Fajardo
     * @param nodo Es el nodo actual que se esta evaluando en la recursión.
     * @param posicion La posición del libro que se quiere eliminar de la pila.
     * @return El nodo modificado después de eliminar el libro en la posición específicada.
     */
    public Nodo recursivoEliminaLibro(Nodo nodo, int posicion){
        //Caso base:
        if(nodo == null){
            return null;
        }else{// Si la posición es 0, se eliminara el nodo actual
            if(posicion == 0){
                return nodo.getSig();
            }
            //Llamada recursiva: para avanzar al siguiente nodo
            nodo.setSig(recursivoEliminaLibro(nodo.getSig(), posicion -1));
            return nodo;
        }
    }
    
    /***
     * Cuenta la cantidad de libros de un específico género que hay en la pila.
     * @author Fernanda Fajardo
     * @param genero El género de los libros que se van a contar.
     * @return La cantidad de libros del género específico.
     */
    public int cuentaLibrosGenero(String genero){
        
       int cont = 0;
       Nodo actual = getTop();
       
       while(actual != null){
           if(actual.getLibro().getGenero().equals(genero)){
               cont = cont + 1;
           }
           actual = actual.getSig();
       }
       return cont;
    }
    
    /**
     * Retorna el tamaño de la pila es decir, la cantidad de elementos almacenanos en ella.
     * @author Fernanda Fajardo
     * @return La cantidad de libros en la pila.
     */
    public int retornaTamano(){
        
        int tamano = 0;
        Nodo actual = getTop();
        
        while(actual != null){
            tamano = tamano + 1;
            actual = actual.getSig();
        }
        return tamano;
    }
    
    /***
     * Invierte la pila de manera recursiva.
     * Despues de ejecutar este método, el libro en el fondo de la pila pasará a estar en el tope.
     * @author Fernanda Fajardo
     */
    public void retornaInversa(){
        if(!isEmpty()){ // Si no esta vacio
            Libro libro = pop(); // Extrae el elemento del tope
            retornaInversa(); // llamada recursiva para invertir el resto de la pila
            insertaAlFinal(libro); //  Inserta el libro extraído en la parte inferior de la pila
        }
    }
    
    /***
     * Inserta un libro en la parte inferior de la pila de manera recursiva.
     * @author Fernanda Fajardo
     * @param libro El libro que se insertará al final de la pila
     */
    public void insertaAlFinal(Libro libro){
        if(isEmpty()){
            push(libro);
        }else{
            Libro aux = pop(); // Extrae el libro del tope
            insertaAlFinal(libro); // Llamada recursiva para seguir bajando e la pila
            push(aux); // vuelve a apilar el elemento que se extrajo.
        }
    }
    
}
