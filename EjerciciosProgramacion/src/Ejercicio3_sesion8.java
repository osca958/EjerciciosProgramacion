//3. Valor máximo y mínimo
// Dado un array de enteros, muestra el valor más alto y el más bajo.
public class Ejercicio3_sesion8 {
    public static void main (String[] args){
        int[] numeros = {2,3,4,5,6};
        int max = numeros[0]; //Creo 2 variables inicializadas en la posicion 0 del array
        int min = numeros[0];
        for ( int i= 0; i<numeros.length; i++) {
            if (numeros[i] < min ){
                min = numeros[i]; //Comparo los numeros con el maximo y minimo ya establecido
            }
            if (numeros[i] > max){ //Sustituyo el valor de max por el número que se cree en la iteración
                max = numeros[i];
            }
        }
        System.out.println("El número más pequeño es: " + min); //Muestro el resultado
        System.out.println("El números más grande es: " + max);

    }
}
