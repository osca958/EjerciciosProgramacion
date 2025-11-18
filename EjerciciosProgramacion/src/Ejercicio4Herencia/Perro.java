package Ejercicio4Herencia;

public class Perro extends Animal{
    public Perro (String clase) {
        super(clase);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro hace 'Guau'");
    }
}
