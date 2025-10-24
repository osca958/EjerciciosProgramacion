import java.util.Scanner;
//10.Suma de elementos en un array
//Pide 5 números al usuario, guárdalos en un array y muestra la suma total.
public class Ejercicio10Santillana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 5 números separados por espacio: ");
        int numeros[] = new int[5];
        int suma = 0;
        for (int i = 0; i< numeros.length; i++) {
            numeros[i] = scanner.nextInt(); // guardo cada número en el array
            suma += numeros[i]; // sumo los números
        }
        System.out.println("La suma total de tus números es: " + suma); // muestro el resultado
    }
}
