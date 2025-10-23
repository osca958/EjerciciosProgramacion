import java.util.Scanner;

//🟨 Ejercicio 8 – Leer números y sumar los positivos, ignorando los negativos con continue
//Pide al usuario 5 números enteros. Suma solo los positivos usando continue para ignorar los negativos.
public class Ejercicio8_sesion6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduce 5 números: ");
        int suma = 0;
        for ( int i=0; i<5; i++){
            int numero = scanner.nextInt();
            if(numero<0){
                continue;
            }
            suma += numero;

        }
        System.out.println("La suma de los números introducidos es: " + suma);
    }
}
