import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
//Haz un pequeño programa que permita al usuario gestionar una lista de la compra:
//
//• Añadir productos.
//
//• Mostrar productos.
//
//• Eliminar productos por nombre.
//
//• Mostrar la lista ordenada alfabéticamente.
public class EjercicioPractico_sesion9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaCompra = new ArrayList<>();
        int opcion = 0;
        while (opcion!= 5) {
            System.out.println("OPCIONES:");
            System.out.println("1.Añadir productos.");
            System.out.println("2.Mostrar productos en lista.");
            System.out.println("3.Eliminar un producto.");
            System.out.println("4.Ordenar lista alfabeticamente.");
            System.out.println("5.Salir.");
            System.out.println("Introduce una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Introduce el producto que quieres añadir: ");
                    String producto = scanner.nextLine();
                    listaCompra.add(producto);
                    break;
                case 2:
                    System.out.println("Estos son los productos en tu lista: " + listaCompra);
                    break;
                case 3:
                    System.out.println("Introduce el producto que quieres eliminar: ");
                    String eliminar = scanner.nextLine();
                    if (listaCompra.remove(eliminar)) {
                        System.out.println("Producto eliminado. ");
                    }else {
                        System.out.println("El producto no se encuentra en la lista.");
                    }
                    break;
                case 4:
                    Collections.sort(listaCompra);
                    System.out.println("Su lista de la compra ordenada es: " + listaCompra);
                    break;
                case 5:
                    System.out.println("Saliendo.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor introduce una opción válida.");
            }

            }

        }
    }
