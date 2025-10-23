public class Ejercicio5_sesion7 {
    public static void main(String[] args) {
        try {
            String nombre = null;

            System.out.println("La longitud del nombre es: " + nombre.length());
        }catch (NullPointerException e){
            System.out.println("El nombre no puede ser null.");
        }
        }

    }
