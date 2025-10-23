//4️⃣ Crea un programa que reciba dos números y determine cuál es mayor, menor o si son iguales.

import java.util.Scanner;

public class Ejercicio4_sesion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int a = scanner.nextInt();
        System.out.println("Introduce otro número: ");
        int b = scanner.nextInt();

        if (a>b){
            System.out.println(a + " es mayor que "+ b );
        }   if (a<b) {
                System.out.println(a +" es menor que " + b);
        } else {
            System.out.println("Los dos números son iguales.");
        }

    }
}
