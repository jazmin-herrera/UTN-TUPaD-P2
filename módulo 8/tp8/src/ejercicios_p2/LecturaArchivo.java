/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_p2;

/**
 *
 * @author herre
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {
    public static void main(String[] args) {
        try {
            File archivo = new File("archivo.txt");
            try (Scanner sc = new Scanner(archivo)) {
                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo no existe.");
        }
    }
}