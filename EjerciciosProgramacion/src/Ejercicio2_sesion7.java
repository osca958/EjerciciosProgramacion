import java.util.Scanner;
public class Ejercicio2_sesion7 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Escribe un número (en texto): ");
                String texto = sc.nextLine();

                int numero = Integer.parseInt(texto);
                System.out.println("Número x 10: " + (numero * 10));
            } catch (NumberFormatException e ){
                System.out.println("No has introducido un número en formato texto.");
            }

            sc.close();
        }

    }


