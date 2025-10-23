import java.util.ArrayList;
//10. Eliminar duplicados de una lista
//Crea una ArrayList con elementos repetidos (por ejemplo: [1, 2, 2, 3, 4, 4, 5])
//Elimina los duplicados y muestra la lista final sin repetir.
public class Ejercicio10_sesion9 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(2);
        numeros.add(3);
        numeros.add(3);
        numeros.add(4);
        numeros.add(2);
        numeros.add(4);
        numeros.add(5);
        System.out.println("Esta es la lista de números inicial: " + numeros);
        ArrayList<Integer> vistos = new ArrayList<>();
        for (int i = 0; i< numeros.size() ; i++){
            int numero = numeros.get(i);
            if (!vistos.contains(numero)){
                vistos.add(numero);
            }
        }
        System.out.println("Esta es la lista de numeros sin repetir: " + vistos);

    }
}
