import java.util.Scanner;
//1. Área de un círculo
//Crea una clase que calcule el área de un círculo usando una constante PI. El
//usuario debe introducir el radio. pi * r^2

public class Ejercicio1Santillana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double pi = 3.14159;
        System.out.println("Introduce el radio en centímetros: ");
        double radio = scanner.nextDouble();
        double resultado = pi *(Math.pow(radio, 2));
        System.out.println("El área de tu círculo es: " + String.format("%.2f",resultado) + " cm.");
    }
}
