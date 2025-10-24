import java.util.Scanner;
//7. Tabla de multiplicar de un número dado
//Pide un número al usuario y muestra su tabla de multiplicar del 1 al 10.
public class Ejercicio7Santillana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce el número del que quieres saber la tabla de multiplicar: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " X " + numero + " = " + (i*numero));
        }
    }
}
