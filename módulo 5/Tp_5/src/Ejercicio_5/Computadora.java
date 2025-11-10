/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_5;

/**
 *
 * @author herre
 */
public class Computadora {
   private final String marca;
    private final String numeroSerie;
    private final PlacaMadre placaMadre; // Composición
    private final Propietario propietario; // Asociación bidireccional

    public Computadora(String marca, String numeroSerie, Propietario propietario, String modeloPlaca, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset);
        this.propietario = propietario;
        propietario.setComputadora(this);
    }

    public void mostrarDatos() {
        System.out.println("Computadora: " + marca + " | Serie: " + numeroSerie);
        System.out.println("Placa Madre: " + placaMadre.getModelo() + " (" + placaMadre.getChipset() + ")");
        System.out.println("Propietario: " + propietario.getNombre() + " - DNI: " + propietario.getDni());
    } 
}
