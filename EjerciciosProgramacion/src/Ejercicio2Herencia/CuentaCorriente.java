package Ejercicio2Herencia;

public class CuentaCorriente extends Cuenta{
    private int limiteDescubierto;

    public CuentaCorriente(String titular, double saldo, int limiteDescubierto) {
        super (titular, saldo);
        this.limiteDescubierto = limiteDescubierto;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Cuenta Corriente ");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo + " euros.");
        System.out.println("Límite de descubierto permitido: " + limiteDescubierto + " euros.");
    }
}
