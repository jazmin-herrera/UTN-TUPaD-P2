/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author herre
 */
import java.util.Scanner;
public class punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System. in) ;

int numUno, numDos, numTres, mayor;

System.out.println("Ingrese 3 numeros");
System.out.println("Primer numero: ");
numUno = Integer.parseInt(input.nextLine());
System.out.println("Segundo numero: ");
numDos = Integer.parseInt (input.nextLine());
System.out.println ("Tercer numero: ");
numTres = Integer.parseInt(input.nextLine());

mayor = numUno; 

if (numDos > mayor) { 
   mayor = numDos;
}
if (numTres > mayor) { 
mayor = numTres;
}
System.out.println ("El mayor es: " + mayor) ;
    }
  }

