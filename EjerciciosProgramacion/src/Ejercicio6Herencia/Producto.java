package Ejercicio6Herencia;

public abstract class Producto implements Vendible{
    protected String nombre;
    protected double precioBase;

    public Producto(String nombre , double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecioFinal();

    public double calcularImporte() {
        return calcularPrecioFinal();
    }
}
