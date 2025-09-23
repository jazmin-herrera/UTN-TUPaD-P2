/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author herre
 */
public class punto_13 {

    /**
     * Muestra los precios de un arreglo de manera recursiva.
     *
     * @param precios arreglo de precios
     * @param indice posición actual que se está mostrando
     */
    public static void mostrarPreciosRecursivo(double[] precios, int indice) {
        // Caso base: si el índice llegó al final del array, detenemos
        if (indice >= precios.length) {
            return;
        }

        // Imprimimos el precio en la posición actual
        System.out.println("Precio[" + indice + "] = " + precios[indice]);

        // Llamada recursiva para el siguiente elemento
        mostrarPreciosRecursivo(precios, indice + 1);
    }

    public static void main(String[] args) {
        // Declaramos e inicializamos el array
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // Mostramos los precios originales
        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);

        // Modificamos el precio de la posición 2
        precios[2] = 129.99;

        // Mostramos los precios modificados
        System.out.println("Precios modificados:");
        mostrarPreciosRecursivo(precios, 0);
    }
}
