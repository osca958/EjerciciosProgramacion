//Ejercicio 1 – Herencia básica
//Diseña una clase Vehículo con los métodos double calcularVelocidadMaxima() y
//double consumo(). En la clase padre, esos métodos simplemente imprimirán “No
//implementado”.
//Crea dos subclases:
//• Coche (con atributo caballos)
//• Bicicleta (con atributo numeroMarchas)
//En el main, guarda varios vehículos en un array y muestra la velocidad máxima y el
//consumo de cada uno.
package Ejercicio1Herencia;

public class Vehiculo {
    protected String nombre;
    public Vehiculo (String nombre) {
        this.nombre = nombre;
    }
    public double calcularVelocidadMaxima(){
        return  0;
    }

    public double consumo () {
        return 0;
    }

    public void mostrarInfo() {
        System.out.println("Vehículo: " + nombre);
        System.out.println("Velocidad máxima: " + calcularVelocidadMaxima() + " km/h.");
        System.out.println("Consumo: " + consumo());
    }

}
