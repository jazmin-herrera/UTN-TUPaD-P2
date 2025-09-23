/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author herre
 */
import java.util.Scanner;
public class punto8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double precio, impuesto, descuento;

        System.out.println("Ingrese el precio base del producto: ");
        precio = input.nextDouble();

        System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        impuesto = input.nextDouble();

        System.out.println("Ingrese la zona de envío (Nacional/Internacional): ");
        descuento = input.nextDouble();

        double precioFinal = calcularPrecioFinal(precio, impuesto, descuento);
        System.out.println("El precio final del producto es: $" + precioFinal);
    }
    

    /**
     * Calcula el precio final de un producto aplicando un impuesto y un descuento.
     * @param precioBase El precio base del producto (sin impuesto ni descuento).
     * @param impuesto El porcentaje de impuesto a aplicar (por ejemplo, 21 para 21%).
     * @param descuento El porcentaje de descuento a aplicar (por ejemplo, 15 para 15%).
     * @return El precio final del producto con el impuesto sumado y el descuento restado.
     */
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal = precioBase + ((precioBase * impuesto) / 100) - ((precioBase * descuento) / 100);
        return precioFinal;
    }
}