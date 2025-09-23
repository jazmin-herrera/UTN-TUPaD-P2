/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author herre
 */
import java.util.Scanner;
public class punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System. in);
        
int precio;
double precioConDescuento;
char categoria;

System.out.println("Ingrese el precio del producto");
precio = Integer.parseInt(input.nextLine());

System.out.println("Ingrese la categoria del producto (A, B o C) ");
categoria = input.nextLine().charAt(0);

switch (categoria) {
   case 'A', 'a' -> {
       precioConDescuento = precio -(precio * 0.10);
       System.out.print("Descuento aplicado 10%");
       System.out.println("");
       System.out.print("Precio final: $" + precioConDescuento);
            }
   case 'B', 'b' -> {
       precioConDescuento = precio - (precio * 0.15);
       System.out.print("Descuento aplicado 15%");
       System.out.println("");
       System.out.print ("Precio final: $" + precioConDescuento);
            }
      
   case 'C', 'c' -> {
       precioConDescuento = precio - (precio * 0.20);
       System.out.print("Descuento aplicado 20%");
       System.out.println("");
       System.out.print("Precio final: $" + precioConDescuento);
            }
   default -> System.out.println("No ingreso una categoria valida");
    }
  } 
}
