import java.util.Scanner;
import java.util.ArrayList;

// Usa un ArrayList<String> para guardar nombres introducidos por el
// usuario hasta que escriba "fin". Luego muestra todos los nombres.
public class Ejercicio12Santillana {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un nombre (o 'fin para salir'): ");
        String nombre = scanner.nextLine();
        while (!nombre.equalsIgnoreCase("fin")) {
            nombres.add(nombre);
            System.out.println("Nombre añadido correctamente.");
            System.out.println("Introduce otro nombre: ");
            nombre = scanner.nextLine();
        }
        int contador = 1;
        for( String n: nombres) {
            System.out.println("Nombre " + contador + " -> " + n);
            contador++;
        }
    }
}
