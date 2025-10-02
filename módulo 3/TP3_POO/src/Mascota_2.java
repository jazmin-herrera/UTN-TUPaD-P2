/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author herre
 */
public class Mascota_2 {
    private final String nombre;
    private final String especie;
    private int edad;

    // Constructor
    public Mascota_2(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Métodos
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " | Especie: " + especie + " | Edad: " + edad);
    }

    public void envejecer(int años) {
        this.edad += años;  
    }

    // Main
    public static void main(String[] args) {
        Mascota_2 m1 = new Mascota_2("Firulais", "Perro", 5); 
        m1.mostrarInformacion();

        m1.envejecer(2); 
        m1.mostrarInformacion();
    }
}

    
    

