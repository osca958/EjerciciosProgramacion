package Ejercicio1Herencia;

public class Bicicleta extends Vehiculo{
    private int numeroMarchas;

    public Bicicleta (String nombre, int numeroMarchas) {
        super (nombre);
        this.numeroMarchas = numeroMarchas;
    }

    @Override
    public double calcularVelocidadMaxima () {
        return numeroMarchas * 3;
    }

    public double consumo () {
        return  0;
    }
}
