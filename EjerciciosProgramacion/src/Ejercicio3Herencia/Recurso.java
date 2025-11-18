//Ejercicio 3 – Biblioteca digital
//Crea una clase Recurso con atributos titulo y autor.
//Crea dos subclases:
//• Libro con atributo numeroPaginas.
//• Revista con atributo numeroEdicion.
//En cada clase implementa un méto_do mostrarInfo() que imprima todos los datos.
//En el main, guarda varios "Recurso" en un array (Libro y Revista) y muestra la
//información de cada uno.
package Ejercicio3Herencia;

public class Recurso {
    protected String titulo;
    protected String autor;

    public Recurso(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}

