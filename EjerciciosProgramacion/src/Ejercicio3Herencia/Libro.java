package Ejercicio3Herencia;

public class Libro extends Recurso {
    private int numeroPaginas;
    public Libro (String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Título del libro: " + titulo);
        System.out.println("Autor del mismo: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}
