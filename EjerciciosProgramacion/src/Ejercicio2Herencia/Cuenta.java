//Ejercicio 2 – Especialización de usuarios
//Crea una clase Cuenta con atributos titular y saldo, y un méto do mostrarDatos().
//En la clase padre, ese mét do simplemente imprimirá “No implementado”.
//
//Crea dos subclases:
//• CuentaAhorro (con atributo interesAnual)
//• CuentaCorriente (con atributo limiteDescubierto)
//En el main, guarda varias cuentas en una lista y, usando polimorfismo, muestra los
//datos de cada una.
package Ejercicio2Herencia;

public class Cuenta {
    protected String titular;
    protected double saldo;

    public Cuenta (String titular, double saldo ) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public void mostrarInfo (){
        System.out.println("No implementado.");
    }
}
