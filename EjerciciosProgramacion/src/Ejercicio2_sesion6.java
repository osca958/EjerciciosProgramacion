//🟨 Ejercicio 2 – Saltarse los múltiplos de 3 con continue
//Escribe un programa que muestre los números del 1 al 10, excepto los múltiplos de 3.
// Usa un bucle for con continue.
public class Ejercicio2_sesion6 {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            if (i%3==0){
                continue;
            }
            System.out.println("Estos son los números sin los múltiplos de 3: " + i);
        }
    }
}
