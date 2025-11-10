/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_9;

/**
 *
 * @author herre
 */
public class CitaMedica {
  private final String fecha;
    private final String hora;
    private final Paciente paciente;     // Asociación unidireccional
    private final Profesional profesional; // Asociación unidireccional

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    public void mostrarDatos() {
        System.out.println("Cita Médica - Fecha: " + fecha + " Hora: " + hora);
        System.out.println("Paciente: " + paciente.getNombre() + " - Obra Social: " + paciente.getObraSocial());
        System.out.println("Profesional: " + profesional.getNombre() + " - Especialidad: " + profesional.getEspecialidad());
    }  
}
