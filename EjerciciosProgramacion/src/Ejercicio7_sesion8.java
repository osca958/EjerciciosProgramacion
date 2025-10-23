import java.util.ArrayList;
//7. Añadir y eliminar elementos
// Crea una lista de tareas (ArrayList<String>), añade elementos y elimina uno por su nombre.
public class Ejercicio7_sesion8 {
    public static void main(String[] args) {
        ArrayList<String> tareas = new ArrayList<>();
        tareas.add("Comer");
        tareas.add("Leer");
        tareas.add("Estudiar");
        tareas.add("Ejercicio");
        for (int i=0; i<tareas.toArray().length; i++){
            System.out.println("Tarea " + (i+1) + ": " + tareas.get(i));
        }

        tareas.remove("Leer");
        for (int i=0; i<tareas.toArray().length ; i++){
            System.out.println("Tarea " + (i+1) + ": " + tareas.get(i));
        }

    }
}
