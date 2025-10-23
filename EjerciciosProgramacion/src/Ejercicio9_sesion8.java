import java.util.ArrayList;
import java.util.Arrays;

//9. Convertir array a lista
// Dado un array de enteros, conviértelo a una ArrayList<Integer> y muestra su contenido.
public class Ejercicio9_sesion8 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        for ( int num : numeros){
            listaNumeros.add(num);
        }
        for (int i=0;i<listaNumeros.size(); i++){
            System.out.println("Elemento " + (i+1) + ": " + listaNumeros.get(i));
        }
    }
}
