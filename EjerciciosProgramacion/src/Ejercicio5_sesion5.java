import java.util.Scanner;

//📌 Objetivo: Pedir una contraseña y no permitir el acceso hasta que el usuario ingrese java123.
public class Ejercicio5_sesion5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contraseña;
        do {
            System.out.println("Introduce la contraseña: ");
            contraseña = scanner.nextLine();
        } while (!contraseña.equals("oscar123")); //Esto se va a repetir hasta que introduzca la correcta
        System.out.println("Contraseña correcta! ");
    }
}
