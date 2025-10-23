import java.util.Scanner;
//3. Conversión entre Celsius y Fahrenheit
//Usa funciones para convertir temperaturas. Asegúrate de que los tipos de
//datos sean apropiados.
//(X °C × 9 / 5) + 32 = X °F
public class Ejercicio3Santillana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la temperatura en Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("La temperatura convertida es: " + fahrenheit);
    }
}
