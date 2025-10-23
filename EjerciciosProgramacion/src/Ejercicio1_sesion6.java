import java.util.Scanner;

//🟨 Ejercicio 1 – Salir de un bucle while con break
//Haz un programa que pida al usuario números enteros positivos.
// El programa debe terminar cuando el usuario introduzca el número 0. Usa un bucle while con break.
public class Ejercicio1_sesion6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while ( true) {
            System.out.println("Introduce un número entero positivo: ");
            int numero = scanner.nextInt();
            if (numero == 0) {
                System.out.println("Saliendo del programa...");
                break;
            }

            System.out.println("Tu numero es: " + numero);
        }
    }
}
