package Ejercicio2Herencia;

public class Main {
    public static void main (String[] args ) {
        Cuenta c1 = new CuentaAhorro("Oscar Coque Pérez", 12000, 2);
        Cuenta c2 = new CuentaAhorro("Lydia del Teso", 2500, 2.3);
        Cuenta c3 = new CuentaCorriente("Marisa Pérez", 47000, 1000);
        Cuenta c4 = new CuentaCorriente("Tamara Coque Pérez", 11000, 500);

        Cuenta[] cuentas = {c1, c2, c3, c4};
        for (Cuenta c : cuentas) {
            c.mostrarInfo();
        }
    }
}
