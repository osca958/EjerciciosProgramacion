import java.util.ArrayList;
//6. Crear una lista de nombres
// Crea una ArrayList de tipo String, añade 5 nombres y muéstralos por pantalla.
public class Ejercicio6_sesion8 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(); //Creo un arraylist llamada nombres
        nombres.add("Óscar");
        nombres.add("Marisa");
        nombres.add("Javier");
        nombres.add("Shaila");
        nombres.add("Tamara");
        for(int i=0; i< nombres.toArray().length; i++){
            System.out.println("Nombre " + (i+1) +": " + nombres.get(i)); //No se accede como un Array normal, se usa .get()
        }
    }
}
