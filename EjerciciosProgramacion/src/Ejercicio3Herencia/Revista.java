package Ejercicio3Herencia;

public class Revista extends Recurso{
    private int numEdicion;
    public Revista(String titulo, String autor, int numEdicion) {
        super(titulo, autor);
        this.numEdicion = numEdicion;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre de la revista: " + titulo);
        System.out.println("Editor: " + autor);
        System.out.println("Número de edición: " + numEdicion);
    }
}
