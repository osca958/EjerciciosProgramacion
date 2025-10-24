import java.util.Scanner;
//11.Buscar número en un array
//Crea un array de 10 números, pide al usuario un número y muestra si está
//en el array.
public class Ejercicio11Santillana {
    public static void main(String[] args) {
        int numeros[] = {1,2,3,4,5,6,7,8,9,10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número que quieres buscar: ");
        int numeroBuscado = scanner.nextInt();
        boolean encontrado = false;
        for ( int i = 1; i <= 10; i++) {
            if (numeroBuscado == i) {
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("El número está en la lista.");
        }else {
            System.err.println("El número no se encuentra.");
        }
    }
}
