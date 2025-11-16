import java.sql.Array;
import java.util.Random;

//13.Números pares de un array
//Llena un array con 20 números aleatorios del 1 al 100 y muestra solo los
//pares.
public class Ejercicio13Santillana {
    public static void main(String[] args) {
        int numeros [] = new int[20];
        Random rand = new Random();
        for (int i = 0; i < numeros.length ; i++) {
            numeros[i] = rand.nextInt(100)+1;
        }
        System.out.println("Todos los números de la lista: ");
        int contador = 1;
        for (int num : numeros){
            System.out.println("Número " + contador + " -> " + num);
            contador++;
        }
        System.out.println("Números pares de la lista");
        int contador2 = 1;
        for (int nume : numeros) {
            if (nume%2 == 0) {
                System.out.println("Número " + contador2 + " -> " + nume);
                contador2++;
            }
        }
    }
}
