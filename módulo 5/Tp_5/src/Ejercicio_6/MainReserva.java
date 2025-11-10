/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_6;

/**
 *
 * @author herre
 */
public class MainReserva {

    public static void main(String[] args) {
        ClienteRestaurante cliente = new ClienteRestaurante("Carlos Pérez", "3512345678");
        Mesa mesa = new Mesa(7, 4);
        Reserva reserva = new Reserva("15/11/2025", "21:00", cliente, mesa);

        reserva.mostrarDatos();
    }
}