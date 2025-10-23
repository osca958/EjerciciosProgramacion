import java.util.ArrayList;
import java.util.Scanner;
//8. Buscar en la lista
// Pregunta al usuario un nombre, y busca si está en la lista. Si está, muestra su posición.
public class Ejercicio8_sesion8 {
    public static void main(String[] args){
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Óscar".toLowerCase());
        nombres.add("Marisa".toLowerCase());
        nombres.add("Javier".toLowerCase());
        nombres.add("Shaila".toLowerCase());
        nombres.add("Tamara".toLowerCase());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduce el nombre que quieres buscar: ");
        String nombreBuscado = scanner.nextLine().toLowerCase();
            if (nombres.contains(nombreBuscado)) { //Le pregunto si nombres contiene el nombre buscado
                int posicion = nombres.indexOf(nombreBuscado); // Le pregunto en que posición se encuentra el nombre buscado
                System.out.println("El nombre está y se encuentra en la posición: " + (posicion+1) );
            }else {
                System.out.println("El número no se encuentra en la lista.");
            }
        }

    }

