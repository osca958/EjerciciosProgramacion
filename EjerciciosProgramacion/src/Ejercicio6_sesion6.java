import java.util.Scanner;

//🟨 Ejercicio 6 – Acceder a una posición no válida de una cadena (charAt) con control de excepción
//Solicita una palabra al usuario y pide una posición. Intenta mostrar el carácter en esa posición usando try-catch.
// Si se produce un error, muestra un mensaje.
public class Ejercicio6_sesion6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduce una palabra: ");
        String palabra = scanner.nextLine();
        System.out.println("Introduce el número de la posición de la letra a conocer: ");
        int posicion = scanner.nextInt();
        try {
            char letra = palabra.charAt(posicion-1);
            System.out.println("La letra en esa posición es: " + letra);

        } catch(StringIndexOutOfBoundsException e){
            System.out.println("La posición introducida no es válida!");
        }
    }
}
