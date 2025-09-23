/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author herre
 */
import java.util.Scanner;
public class punto_11 {

    // Variable global: descuento especial del 10%
    public static final double DESCUENTO_ESPECIAL = 0.10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir el precio original al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();

        // Llamamos al método que aplica el descuento
        calcularDescuentoEspecial(precio);
    }

    /**
     * Calcula y muestra el descuento especial aplicado a un producto,
     * junto con el precio final.
     *
     * @param precio Precio original del producto antes de aplicar el descuento
     */
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        // Mostramos los resultados
        System.out.println("El descuento aplicado es de: $" + descuentoAplicado);
        System.out.println("El precio final del producto es: $" + precioFinal);
    }
}


    
    

