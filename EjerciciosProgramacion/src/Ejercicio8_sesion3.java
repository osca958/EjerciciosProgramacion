import java.util.Scanner;

//8️⃣ Crea un programa que pida al usuario dos números y evalúe si son múltiplos (num1 % num2 == 0).
public class Ejercicio8_sesion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduce un número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Por favor introduce otro número: ");
        int numero2 = scanner.nextInt();
        if (numero1 % numero2 == 0) {
            System.out.println("Los números introducidos son multiplos entre ellos.");
        } else {
            System.out.println("Los números introducidos no son multiplos entre ellos.");
        }
    }
}
