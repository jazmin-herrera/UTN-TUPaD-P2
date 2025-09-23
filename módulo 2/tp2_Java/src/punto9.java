/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author herre
 */
import java.util.Scanner;
public class punto9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos input para leer los datos
        Scanner input = new Scanner(System.in);

        // Declaramos variables para guardar los datos que pedimos al usuario
        double peso, precioProducto;
        String zona;

        // Solicitamos el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = input.nextDouble();

        // Solicitamos el peso del paquete
        System.out.print("Ingrese el peso del paquete: ");
        peso = input.nextDouble();
        input.nextLine(); // Consumimos el Enter pendiente

        // Solicitamos la zona de envío
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        zona = input.nextLine();

        // Calculamos el costo de envío
        double costoEnvio = calcularCostoEnvio(peso, zona);

        // Calculamos el precio final de la compra
        double precioFinal = calcularTotalCompra(precioProducto, costoEnvio);

        // Mostramos los resultados
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + precioFinal);
    }

    /**
     * Calcula el costo de envío en función del peso y la zona de destino.
     *
     * @param peso Peso del paquete en kilogramos.
     * @param zona Zona de envío: puede ser "Nacional" o "Internacional".
     * @return El costo de envío calculado: $5 por kilo para envíos nacionales, $10 por kilo para internacionales.
     */
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio = 0;

        if (zona.equalsIgnoreCase("Nacional")) {
            costoEnvio = peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoEnvio = peso * 10;
        } else {
            System.out.println("Zona no válida, se asume costo 0.");
        }

        return costoEnvio;
    }

    /**
     * Calcula el total de la compra sumando el precio del producto y el costo de envío.
     *
     * @param precioProducto Precio base del producto.
     * @param costoEnvio     Costo de envío previamente calculado.
     * @return El monto total a pagar por la compra.
     */
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
        

    
