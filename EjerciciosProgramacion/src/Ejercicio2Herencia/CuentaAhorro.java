package Ejercicio2Herencia;

public class CuentaAhorro extends Cuenta{
    private double interesAnual;

    public CuentaAhorro(String titular, double saldo, double interesAnual) {
        super (titular, saldo);
        this.interesAnual = interesAnual;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Cuenta ahorro");
        System.out.println("Titular de la cuenta: " + titular);
        System.out.println("Saldo total: " + saldo + " euros.");
        System.out.println("Interés anual: " + interesAnual + " %.");
    }
}
