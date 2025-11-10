/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_1;

/**
 *
 * @author herre
 */
public class MainPasaporte {

    public static void main(String[] args) {
        Titular titular = new Titular("Lucía Fernández", "45891234");
        Pasaporte pasaporte = new Pasaporte("A123456", "10/09/2024", titular, "lucia.jpg", "JPG");

        pasaporte.mostrarDatos();
    }
}