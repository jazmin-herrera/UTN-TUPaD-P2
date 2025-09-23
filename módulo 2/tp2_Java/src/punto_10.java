/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author herre
 */
import java.util.Scanner;
public class punto_10 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedimos datos al usuario
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = input.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = input.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = input.nextInt();

        // Calculamos el nuevo stock
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        // Mostramos resultado
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }

    /**
     * Actualiza el stock disponible de un producto según la cantidad vendida y recibida.
     *
     * @param stockActual      Cantidad actual en stock antes de la operación.
     * @param cantidadVendida  Cantidad de unidades vendidas (se restan del stock).
     * @param cantidadRecibida Cantidad de unidades recibidas o repuestas (se suman al stock).
     * @return El nuevo stock disponible después de aplicar ventas y reposiciones.
     */
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = (stockActual - cantidadVendida) + cantidadRecibida;
        return nuevoStock;
    }
}
    

