//Ejercicio 4 – Zoológico
//Crea una clase Animal con atributo nombre y un méto_do hacerSonido().
//Crea dos subclases:
//Perro que implemente hacerSonido() mostrando "Guau".
//Gato que implemente hacerSonido() mostrando "Miau".
//En el main, guarda varios animales en una lista y recórrela para que todos hagan
//su sonido.
package Ejercicio4Herencia;

public class Animal {
    protected String clase;
    public Animal (String clase) {
        this.clase = clase;
    }
    public void hacerSonido() {}
}
