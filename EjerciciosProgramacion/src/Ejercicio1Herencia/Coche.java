package Ejercicio1Herencia;

public class Coche extends Vehiculo{
    private int caballos;

    public Coche(String nombre, int caballos) {
        super (nombre);
        this.caballos = caballos;
    }
    @Override
    public double calcularVelocidadMaxima() {
        return caballos * 0.5;
    }

    @Override
    public double consumo () {
        return caballos * 0.1;
    }
}
