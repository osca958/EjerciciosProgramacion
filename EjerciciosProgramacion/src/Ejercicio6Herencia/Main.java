package Ejercicio6Herencia;

public class Main {
    public static void main(String[] args) {
        Producto [] productos = {new ProductoFisico("DVD", 15.90, 2.99), new ProductoDigital("Juego" , 60.99, 10.00)};

        for (Producto p : productos) {
            if (p instanceof ProductoFisico) {
                System.out.println("El precio final de " + p.nombre +" es: " + p.calcularImporte());
            }else if (p instanceof ProductoDigital) {
                System.out.println("El precio final de " + p.nombre + " es: " + p.calcularImporte());
            }
        }
    }
}
