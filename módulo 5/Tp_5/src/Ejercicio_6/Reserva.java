/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_6;

/**
 *
 * @author herre
 */
public class Reserva {
    private final String fecha;
    private final String hora;
    private final ClienteRestaurante cliente; // Asociación unidireccional
    private final Mesa mesa;                  // Agregación

    public Reserva(String fecha, String hora, ClienteRestaurante cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public void mostrarDatos() {
        System.out.println("Reserva: " + fecha + " a las " + hora);
        System.out.println("Cliente: " + cliente.getNombre() + " - Tel: " + cliente.getTelefono());
        System.out.println("Mesa Nº " + mesa.getNumero() + " - Capacidad: " + mesa.getCapacidad());
    }
}
