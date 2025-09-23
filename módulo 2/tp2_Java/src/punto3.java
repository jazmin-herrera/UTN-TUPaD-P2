/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author herre
 */
import java.util.Scanner;
public class punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        
    int edad;
    String etapaVida = "";
    

      System.out.println("Ingrese su edad:");
      edad = Integer.parseInt(input.nextLine());
       
      if (edad < 12) {
      etapaVida = "Niño";
      } else if (edad >= 12 && edad <= 17) {
      etapaVida = "Adolescente";
      } else if (edad >= 18 && edad <= 59) {
      etapaVida = "Adulto";
      } else if (edad >= 60 ) {
      etapaVida = "Adulto mayor";
      }
      
System.out.println("Eres un " + etapaVida);
    }
    
}
