import java.util.InputMismatchException;
import java.util.Scanner;

//🟨 Ejercicio 9 – Detectar si se ha introducido texto en lugar de número (try-catch)
//Pide al usuario que introduzca un número. Si escribe una palabra u otro texto,
// el programa debe capturar la excepción y mostrar "Eso no es un número".
public class Ejercicio9_sesion6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Pr favor introduce un número: ");
            int numero = scanner.nextInt();
            System.out.println("El número introducido es: " + numero);
        } catch (InputMismatchException e){
            System.out.println("No has introducido un número.");
        }
    }
}
