package Ejercicio1Herencia;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Coche("Honda", 140);
        Vehiculo v2 = new Bicicleta("Bici1", 9);
        Vehiculo v3 = new Coche("Renault" , 160);
        Vehiculo v4 = new Bicicleta("Bici2", 7);

        Vehiculo[] vehiculos = {v1, v2, v3, v4};

        int contador = 1;
        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
        }
    }
}
