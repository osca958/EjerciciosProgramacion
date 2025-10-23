import java.util.Scanner;
//2. Sumar elementos
//Suma todos los valores de un array de enteros y muestra el total. 

public class Ejercicio2_sesion8 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5] ;
            int suma = 0;

           /* for (int i = 0; i < numeros.length; i++)
            suma += numeros[i];
            System.out.println("La suma es de todos los números es: " + suma);
            */
            for (int i = 0; i< numeros.length; i++){
                System.out.println("Número " + (i+1) + ":" );
                numeros[i] = scanner.nextInt();
            }
            for (int num : numeros ) {
                suma = suma + num; // o suma += num;
            }
        System.out.println("Suma :" + suma);

        }
    }

