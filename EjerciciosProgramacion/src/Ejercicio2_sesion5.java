import java.util.Scanner;

//📌 Objetivo: Crear un menú interactivo donde el usuario elija una opción y se muestre un mensaje diferente según su selección.
public class Ejercicio2_sesion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENÚ DE OPCIONES:");
        System.out.println("Opción 1: Saludar");
        System.out.println("Opción 2: Mostrar fecha.");
        System.out.println("Opción 3: Salir");

        System.out.println("Elije una opción de las anteriores:");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Hola bienvenido!");
                break;
            case 2:
                System.out.println("Hoy es un buen día para programar.");
                break;
            case 3:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Esa opción no es válida, por favor elija otra");
        }
        scanner.close();
    }
}
