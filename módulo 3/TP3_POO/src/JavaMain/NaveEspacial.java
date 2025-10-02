/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaMain;

/**
 *
 * @author herre
 */
class NaveEspacial {
    private String nombre;
    private int combustible;

    // Constructor
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    // Método para despegar
    public void despegar() {
        if (combustible >= 5) {
            combustible -= 5;
            System.out.println("La nave despego...");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    // Método para avanzar cierta cantidad de kilómetros
    public void avanzar(int km) {
        System.out.println("Intentando avanzar " + km + " km:");
        int consumo = km / 1; // 1 unidad de combustible por kilómetro

        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println("La nave avanzo " + km + " kms");
        } else {
            System.out.println("No hay suficiente combustible");
        }
    }

    // Método para recargar combustible
    public void recargarCombustible(int cantidad) {
        combustible += cantidad;
        System.out.println("Recargando " + cantidad + " unidades de combustible:");
    }

    // Método para mostrar el estado actual
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre + ", combustible: " + combustible);
    }
}
