/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.clase.practicaprogramada1;

/**
 *
 * @author fernandafajardo
 */
public class PracticaProgramada1 {

    public static void main(String[] args) {

        // Crear una variable de tipo PilaLibros llamada pila1
        PilaLibros pila1 = new PilaLibros();
        
        // Insertar 6 libros a la pila
        Libro libro1 = new Libro("El paciente", "Juan Gómez-Jurado", "Novela", 400,"01 Abril 2024");
        Libro libro2 = new Libro("La novia gitana", "Carmen Mola", "Novela", 408, "17 Mayo 2018");
        
        Libro libro3 = new Libro("Lo viral", "Jorge Carrión", "Poesía", 192, "01 Octubre 2020");
        Libro libro4 = new Libro("Las cosas que perdimos en el fuego", "Mariana Enriquez", "Poesía", 208, "18 Febrero 2016" );
        Libro libro5 = new Libro("Poesía reunida", "Idea Vilariño", "Poesía", 416, "01 Septiembre 2016");
        
        Libro libro6 = new Libro("Project Hail Mary", "Andy Weir","Ficción",496,"04 Mayo 2021");

        // Agregar los libros a la pila1
        pila1.push(libro1);
        pila1.push(libro2);
        pila1.push(libro3);
        pila1.push(libro4);
        pila1.push(libro5);
        pila1.push(libro6);

        // Imprimir el tamaño de la pila usando el método retornaTamano();
        System.out.println("\nEl tamaño de la pila es: " + pila1.retornaTamano() + " libros.");
        
        // Invocar el método cuentaLibrosGenero(); para contar los libros de género "Novela"
        int numNovela = pila1.cuentaLibrosGenero("Novela");
        System.out.println("\nLos libros del género Novela son: " + numNovela + " libros.");
        
        // Invocar el método eliminaLibro(); para eliminar un libro de la pila en la posición indicada.
        pila1.eliminaLibro(0); //LIFO
       
        // Se volvio a imprimir el método retornaTamano(); para ver el tamaño de la pila una vez se elimino un libro.
        System.out.println("\nEl tamaño de la pila es: " + pila1.retornaTamano() + " libros.");
        
        //Invocar el método retornaInversa(); y se imprime la pila con todo los datos en formato Json
        pila1.retornaInversa();
        System.out.println("\nLos elementos de la pila son:");
        pila1.print();
       
    }
}
