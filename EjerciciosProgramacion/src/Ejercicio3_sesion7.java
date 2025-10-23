import java.util.Scanner;

public class Ejercicio3_sesion7 {
    public static void main(String[] args) {
        String[] frutas = {"Manzana", "Banana", "Naranja"};

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce un número entre 0 y 2: ");
            int posicion = sc.nextInt();

            System.out.println("Fruta seleccionada: " + frutas[posicion]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Has introducido un número fuera del rango.");
        }
        sc.close();
    }

}
