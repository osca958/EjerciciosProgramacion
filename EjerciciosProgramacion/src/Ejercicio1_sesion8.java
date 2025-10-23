import java.util.Scanner;

//1. Declarar y mostrar
// Declara un array de 5 números enteros, asígnales valores y muéstralos por pantalla.
public class Ejercicio1_sesion8 {
    public static void main(String[] args) {
        /*int[] numeros= {3,4,5,6,7};
        for (int i=0;i < numeros.length; i++)
        System.out.println("Elemento en posición "+ (i+1) +": " + numeros[i]);

         */
        //Otra manera de hacerlo con pidiendo al usuario los números
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        System.out.println("CONTENIDO");
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Introduce el número " + (i + 1) + ":" + numeros[i]);
            numeros[i] = scanner.nextInt();
        }

        //Recorrer el vector y sumar todos los números

        for ( int num : numeros){
            suma += num;
        }

        System.out.println("Suma: "+ suma);



    }
}
