import java.util.Random;
import java.util.Scanner;

//🟨 Ejercicio 10 – Salir de un bucle do-while cuando se adivina un número secreto
//Crea un número secreto entre 1 y 10. El usuario tiene que adivinarlo. Usa do-while y break para salir cuando acierte.
public class Ejercicio10_sesion6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(10)+1; //Genera un número random de 1 a 10 se suma uno porque sino seria 9
        Scanner scanner = new Scanner(System.in);
        int numeroUsuario= 0;
        do{
            System.out.println("Introduce el número que creas que es (entre 1 y 10)");
            numeroUsuario = scanner.nextInt();
            if(numeroSecreto == numeroUsuario){
                System.out.println("Número correcto!");
                break;
            }else {
                System.out.println("Numero incorrecto, intentalo de nuevo!!");
            }

        }while (numeroSecreto!=numeroUsuario);

    }
}
