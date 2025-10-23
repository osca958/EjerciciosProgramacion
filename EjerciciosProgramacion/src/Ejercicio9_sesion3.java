//9️⃣ Escribe un código que reciba un número e indique si es par o impar usando el operador módulo (%).

import java.util.Scanner;

public class Ejercicio9_sesion3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduce un número positivo: ");
        int num = scanner.nextInt();
        if (num % 2 == 0){
            System.out.println("El número introducido es par.");
        } else {
            System.out.println("El número introducido es impar.");
        }
    }
}
