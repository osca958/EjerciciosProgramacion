import java.util.Scanner;
//2. Conversión de tipos
//Pide un número decimal (double), conviértelo a int, y muestra ambos
//resultados indicando si hubo pérdida de información.
public class Ejercicio2Santillana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número decimal: ");
        double numero = scanner.nextDouble();
        int numeroEntero = (int) numero;
        System.out.println("Número introducido: " + numero);
        System.out.println("Número modificado: " + numeroEntero);
        if (numero!= numeroEntero) {
            System.out.println("Si hubo pérdida de info.");
        }else {
            System.out.println("No hubo perdida de info.");
        }
    }
}
