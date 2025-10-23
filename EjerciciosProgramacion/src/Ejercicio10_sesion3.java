import java.util.Scanner;

//🔟 Define una constante TASA_CAMBIO con el valor 1.12 (dólar a euro). Convierte una cantidad de dólares ingresada por el usuario a euros.
public class Ejercicio10_sesion3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Por favor introduce la cantidad que deseas convertir: ");
        double num = scanner.nextDouble();
        double tasa_cambio = 1.12;
        double resultado = num * tasa_cambio ;
        System.out.printf("%.2f euros son equivalentes a %.2f dólares.%n", num, resultado); // con esto hacemos que tenga formato y le podemos quitar decimales
        //System.out.println( num + " euros es igual a " + resultado + " dolares.");
    }
}


