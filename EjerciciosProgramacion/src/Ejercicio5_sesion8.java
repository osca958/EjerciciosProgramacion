import java.util.Arrays;
//5. Ordenar el array
// Declara un array con números desordenados y ordénalo de menor a mayor utilizando  Arrays.sort().
public class Ejercicio5_sesion8 {
    public static void main(String[] args){
        int[] numeros = {7,2,5,1,9};
        Arrays.sort(numeros);
        //System.out.println(Arrays.toString(numeros)); //Hay que poner lo de Arrays.toString para que muestre el resultado sino muestra hexadecimal
        for ( int num : numeros) {
            System.out.println(num);
        }
    }
}
