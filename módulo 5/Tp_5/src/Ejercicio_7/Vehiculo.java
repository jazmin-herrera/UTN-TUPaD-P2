/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_7;

/**
 *
 * @author herre
 */
public class Vehiculo {
    private final String patente;
    private final String modelo;
    private final Motor motor;       // Agregación
    private final Conductor conductor; // Asociación bidireccional

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
        conductor.setVehiculo(this);
    }

    public void mostrarDatos() {
        System.out.println("Vehículo: " + modelo + " | Patente: " + patente);
        System.out.println("Motor: " + motor.getTipo() + " (" + motor.getNumeroSerie() + ")");
        System.out.println("Conductor: " + conductor.getNombre() + " - Licencia: " + conductor.getLicencia());
    }
}
