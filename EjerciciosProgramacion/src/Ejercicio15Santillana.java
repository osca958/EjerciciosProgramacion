import java.util.Scanner;
//15. Transposición de una matriz
//Pide al usuario una matriz cuadrada y muestra su transpuesta.
public class Ejercicio15Santillana {
    public static void main(String[] args) {
        int [][] numeros = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeros.length ; i++ ) {
            for (int j = 0; j< numeros[i].length; j++) {
                System.out.println("Introduce el número " + (j +1)+ " de la línea " + (i+1));
                numeros [i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriz: ");

        for (int [] fila : numeros) {
            for (int valor : fila){
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz transpuesta: ");
        int [][] transpuesta = new int[2][2];
        for (int i = 0; i < numeros.length; i++){
            for (int j=0; j< numeros[i].length; j++){
                transpuesta [j][i] = numeros[i][j];
            }
        }
        for(int [] fila : transpuesta ) {
            for(int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
