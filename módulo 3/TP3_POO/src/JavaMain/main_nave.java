/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaMain;

/**
 *
 * @author herre
 */
public class main_nave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
  
        // Crear la nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial("Exploradora 1", 50);

        // Estado inicial
        System.out.println("Estado inicial:");
        nave.mostrarEstado();

        // Despegar
        nave.despegar();
        nave.mostrarEstado();

        // Intentar avanzar 30 km sin suficiente combustible
        nave.avanzar(30);

        // Recargar combustible
        nave.recargarCombustible(40);

        // Avanzar 20 km
        nave.avanzar(20);

        // Estado final
        System.out.println("Estado final:");
        nave.mostrarEstado();
    }
}

