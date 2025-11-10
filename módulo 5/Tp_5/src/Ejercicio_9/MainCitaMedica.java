/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_9;

/**
 *
 * @author herre
 */
public class MainCitaMedica {

    public static void main(String[] args) {
        Paciente paciente = new Paciente("Juan Pérez", "OSDE");
        Profesional profesional = new Profesional("Dra. Carla Gómez", "Cardiología");
        CitaMedica cita = new CitaMedica("12/11/2025", "10:30", paciente, profesional);

        cita.mostrarDatos();
    }
    
}
