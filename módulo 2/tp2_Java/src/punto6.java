/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author herre
 */
import java.util.Scanner;
public class punto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;
        int num;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el número " + i + ": ");
            num = Integer.parseInt(input.nextLine());

            if (num > 0) {
                contadorPositivos++;
            } else if (num < 0) {
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        System.out.println("Resultados:");
        System.out.println("Positivos: " + contadorPositivos);
        System.out.println("Negativos: " + contadorNegativos);
        System.out.println("Ceros: " + contadorCeros);
    }
}

