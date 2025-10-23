//🟨 Ejercicio 3 – Finalizar un bucle for al encontrar un número concreto
//Haz un programa que busque el número 7 entre los números del 1 al 20.
// Cuando lo encuentre, debe mostrar un mensaje y terminar el bucle con break.
public class Ejercicio3_sesion6 {
    public static void main(String[] args) {
        for(int i=1; i<=20 ;i++){
            if (i==7){
                break;
            }
            System.out.println("Cadena de números del 1 al 20 parando en el número deseado: " + i);
        }

    }
}
