/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author herre
 */
public class Estudiante_1 {
    private final String nombre;
    private final String apellido;
    private final String curso;
    private double calificacion;
    
    public Estudiante_1(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
        System.out.println();
    }

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
    }
}

class MainEstudiante {
    public static void main(String[] args) {
        Estudiante_1 estudiante = new Estudiante_1("Juan", "Perez", "Comision 1", 8.0);

        estudiante.mostrarInformacion();     // Muestra 8.0
        estudiante.subirCalificacion(2.0);   // Sube a 10.0
        estudiante.mostrarInformacion();     // Muestra 10.0
        estudiante.bajarCalificacion(1.0);   // Baja a 9.0
        estudiante.mostrarInformacion();     // Muestra 9.0
    }
}

    
    

