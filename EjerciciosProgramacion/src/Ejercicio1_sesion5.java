import java.util.Scanner;

//Crea un programa que pida al usuario un número y diga si es positivo o negativo.
public class Ejercicio1_sesion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduce un número: ");
        int num = scanner.nextInt();
        if (num > 0 ) {
            System.out.println("El número es positivo.");
        } else if (num < 0 ){
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }
}
