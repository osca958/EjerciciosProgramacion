import java.util.Random;

//14.Suma de dos matrices 3x3
//Llena dos matrices 3x3 con valores aleatorios y muestra la matriz suma.
public class Ejercicio14Santillana {
    public static void main(String[] args) {
        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        int suma[][] = new int[3][3];
        Random rand = new Random();
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = rand.nextInt(20) + 1;
            }
        }
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = rand.nextInt(20) + 1;
            }
        }

        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.println("Matriz 1: ");
        for (int[] fila : matriz1) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matriz 2: ");
        for (int [] fila : matriz2 ) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Suma de las matrices: ");

        for (int[] fila : suma) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}

