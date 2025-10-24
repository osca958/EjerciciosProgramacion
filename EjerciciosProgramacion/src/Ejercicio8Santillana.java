import java.util.Scanner;
//8. División con control de errores
//Pide dos números e intenta dividir. Controla la excepción si el divisor es
//cero.
public class Ejercicio8Santillana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();
        try {
            System.out.println(numero1 + " / " + numero2 + " = " + (numero1/numero2));
        }catch (ArithmeticException e) {
            System.err.println("No se puede dividir entre 0.");
        }
    }
}
