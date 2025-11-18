package Ejercicio4Herencia;

public class Main {
    public static void main (String [] args) {
        Animal a1 = new Perro ("Perro");
        Animal a2 = new Gato ("Gato");

        Animal [] animales = {a1,a2};
        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
}
