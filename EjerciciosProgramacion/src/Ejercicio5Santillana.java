import java.util.Scanner;

//5. Calculadora básica
//Pide dos números y una operación (+, -, *, /) e implementa una calculadora
//con switch.
public class Ejercicio5Santillana {
    public static void main(String[] args) {
        String operacion = "";
        double numero1 = 0;
        double numero2 = 0;
        while (!operacion.equalsIgnoreCase("Salir")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce que operación quieres realizar (escribe salir para terminar): ");
            operacion = scanner.nextLine();
            if (!operacion.equalsIgnoreCase("Salir")) {
                System.out.println("Introduce el primer número: ");
                numero1 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Introduce el segundo número: ");
                numero2 = scanner.nextDouble();
                scanner.nextLine();
            }
            switch (operacion) {
                case "+":
                    System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                    break;
                case "-":
                    System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
                    break;
                case "*":
                    System.out.println(numero1 + " X " + numero2 + " = " + (numero1*numero2));
                    break;
                case "/":
                    System.out.println(numero1 + " / " + numero2 + " = " + (numero1/numero2));
            }
        }
    }
}
