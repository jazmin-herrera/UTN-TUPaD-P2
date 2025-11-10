/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_7;

/**
 *
 * @author herre
 */
public class MainVehiculo {

    public static void main(String[] args) {
        Motor motor = new Motor("Diesel", "MTR-2025");
        Conductor conductor = new Conductor("Ana Torres", "LIC12345");
        Vehiculo vehiculo = new Vehiculo("AB123CD", "Toyota Hilux", motor, conductor);

        vehiculo.mostrarDatos();
    }
}
