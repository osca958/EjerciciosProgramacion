import java.util.Scanner;

//4. Buscar un elemento
// Pide al usuario un número y muestra si está presente en un array, y en qué posición.
public class Ejercicio4_sesion8 {
    public static void main(String[] args){
        int[] numeros = {1,3,4,5,6,8};
        System.out.println("Introduce el número que quieres buscar: ");
        Scanner scanner = new Scanner(System.in);
        int buscado = scanner.nextInt();
        boolean encontrado = false;
        for (int i=0; i<numeros.length; i++){
            if(buscado == numeros[i]){
                System.out.println("Has encontrado tu número. Y era el " + buscado + "  y estaba en la posisción: " + (i+1));
                encontrado = true;
                break;
            }
        }
        if (!encontrado ){
            System.out.println("El número no está.");
        }
        scanner.close();
    }
}
