import java.util.Scanner;

//📌 Objetivo: Pedir números al usuario hasta que ingrese 0
public class Ejercicio4_sesion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero; // declaramos primero la variable y el tipo para poder usarla después
        System.out.println("Por favor introduce un número: ");
        numero = scanner.nextInt();
        while (numero != 0 ){
            System.out.println("Has introducido el: "+ numero);
            System.out.println("Introduce otro número, si quieres salir introduce 0: ");
            numero = scanner.nextInt();
        }
        System.out.println("Programa finalizado...");
        scanner.close();
    }
}
