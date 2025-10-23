//🟨 Ejercicio 4 – Evitar mostrar letras vocales con continue
//Muestra las letras de la palabra "PROGRAMACION", pero omite las vocales usando continue.
public class Ejercicio4_sesion6 {
    public static void main(String[] args) {
        String palabra = "programacion";
        for(int i = 0;i < palabra.length();i++){ // empezamos en cero hasta hasta el largo de la palabra sumando 1 cada vez
            char letra = palabra.charAt(i); //esto convierte cada letra en un caracter
            if (letra == 'a'|| letra== 'e' || letra == 'i'|| letra == 'o'|| letra == 'u')
                continue;
            System.out.println(letra);
        }
    }
}
