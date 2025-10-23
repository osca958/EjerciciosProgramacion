import java.util.Scanner;

//🟨 Ejercicio 7 – Mensaje de fin con finally
//Haz un programa que intente dividir dos números.
// Usa try-catch-finally para mostrar siempre un mensaje final que diga "Operación terminada".
public class Ejercicio7_sesion6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Por favor introduce el segundo número: ");
        int num2 = scanner.nextInt();
        try{
            int resultado = num1 / num2;
            System.out.println("El resultado de tu división es: " + resultado);
        } catch(ArithmeticException e){
            System.out.println("No se puede dividir entre 0.");
        } finally {
            System.out.println("Operación terminada!!");
        }
    }
}
