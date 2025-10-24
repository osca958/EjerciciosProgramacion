import java.util.InputMismatchException;
import java.util.Scanner;
//9. Lectura segura de enteros
//Usa Scanner para pedir un entero y captura el error si el usuario introduce
//un valor no numérico.
public class Ejercicio9Santillana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Introduzca un número: ");
            int numero = scanner.nextInt();
            System.out.println("El número introducido es: " + numero );
        } catch (InputMismatchException e) {
            System.err.println("Mensaje no valido.");
        }
    }
}
