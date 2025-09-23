/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author herre
 */
import java.util.Scanner;
public class punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 1;
        int sumaPares = 0;

        while (num != 0) {
            System.out.print("Ingrese un numero (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());

            if (num % 2 == 0 && num != 0) {
                sumaPares = sumaPares + num;
            }
        }

        System.out.println("La suma de los numeros pares es: " + sumaPares);
    }
}

