/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1;

/**
 *
 * @author herre
 */
public class Pasaporte {
    private final String numero;
    private final String fechaEmision;
    private final Foto foto; // Composición
    private final Titular titular; // Asociación bidireccional

    public Pasaporte(String numero, String fechaEmision, Titular titular, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.titular = titular;
        this.foto = new Foto(imagen, formato);
        titular.setPasaporte(this);
    }

    public void mostrarDatos() {
        System.out.println("Pasaporte Nº: " + numero + ", emitido el " + fechaEmision);
        System.out.println("Titular: " + titular.getNombre() + " (DNI: " + titular.getDni() + ")");
        System.out.println("Foto: " + foto.getImagen() + " - Formato: " + foto.getFormato());
    }
}
