import java.util.Scanner;
//Instrucción: Añade try-catch-finally para evitar que el programa falle si el divisor es cero o si se introduce texto.
public class Ejercicio1_sesion7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Introduce el dividendo: ");
            int a = scanner.nextInt();

            System.out.print("Introduce el divisor: ");
            int b = scanner.nextInt();

            int resultado = a / b;

            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("No se puede dividir entre cero.");
        } finally {
            System.out.println("Programa finalizado!");
        }
        scanner.close();
    }
}

