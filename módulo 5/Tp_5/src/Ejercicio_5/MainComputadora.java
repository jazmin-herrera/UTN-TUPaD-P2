/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_5;

/**
 *
 * @author herre
 */
public class MainComputadora {

    public static void main(String[] args) {
        Propietario propietario = new Propietario("Jazmín Herrera", "47864024");
        Computadora computadora = new Computadora("Lenovo", "SN12345", propietario, "B550M", "AMD");

        computadora.mostrarDatos();
    }
}
