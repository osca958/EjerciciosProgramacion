import java.util.Scanner;

//🟨 Ejercicio 5 – Dividir dos números con try-catch
//Haz un programa que divida dos números enteros introducidos por el usuario.
// Usa try-catch para evitar que el programa se rompa si el divisor es 0.
public class Ejercicio5_sesion6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int a = scanner.nextInt();
        System.out.println("Introduce el segundo número: ");
        int b = scanner.nextInt();
        try {
            int resultado = (a/b);
            System.out.println(resultado);
        }catch (ArithmeticException e){
            System.out.println("No se puede dividir entre cero.");
        }
        scanner.close();
    }
}
