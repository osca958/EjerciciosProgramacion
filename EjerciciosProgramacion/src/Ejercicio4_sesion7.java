import java.util.Scanner;
import java.util.Random;

public class Ejercicio4_sesion7 {public static void main(String[] args) {
    Random random = new Random();
    int secreto = random.nextInt(10) + 1;

    Scanner sc = new Scanner(System.in);
    try {
        System.out.print("Adivina el número (1-10): ");
        String intentoTexto = sc.nextLine();

        int intento = Integer.parseInt(intentoTexto); //Hacemos esto porque lo que se recibe del escaner es un numero pero en formato texto ("7")

        if (intento == secreto) {
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Incorrecto. El número era: " + secreto);
        }
    } catch (NumberFormatException e){
        System.out.println("No has introducido un número.");
    } finally {
        System.out.println("Juego finalizado!");
    }

    sc.close();
}

}
