package Ejercicio3Herencia;

public class Main {
    public static void main (String[] args) {
        Recurso r1 = new Libro("La maté por un yogur", "Perico palotes", 256);
        Recurso r2 = new Revista("Maldaddddd", "yo mismo con tuvi", 4);
        Recurso r3 = new Libro("ALOPPOOOOAOAO", " tu papa", 345);

        Recurso [] recursos = {r1, r2, r3};
        for (Recurso r : recursos) {
            r.mostrarInfo();
        }
    }
}
