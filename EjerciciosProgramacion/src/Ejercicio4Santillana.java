import java.util.Scanner;
//4. Par o impar
//Pide un número entero y muestra si es par o impar usando if.
public class Ejercicio4Santillana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int numero = scanner.nextInt();
        if (numero%2 == 0) {
            System.out.println("El número introducido es par");
        }else {
            System.out.println("El número introducido es impar.");
        }
    }
}
