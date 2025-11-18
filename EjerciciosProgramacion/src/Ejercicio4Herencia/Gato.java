package Ejercicio4Herencia;

public class Gato extends Animal{
    public Gato (String clase) {
        super(clase);
    }
    @Override
    public void hacerSonido() {
        System.out.println("El gato hace 'MIAUUUUUUUUUUUUUUUU'");
    }
}
