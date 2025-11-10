/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_4;

/**
 *
 * @author herre
 */
class TarjetaDeCredito {
    private final String numero;
    private final String fechaVencimiento;
    private final Cliente cliente; // Asociación bidireccional
    private final Banco banco;     // Agregación

    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
        cliente.setTarjeta(this);
    }

    public void mostrarDatos() {
        System.out.println("Tarjeta Nº: " + numero + " | Vencimiento: " + fechaVencimiento);
        System.out.println("Cliente: " + cliente.getNombre() + " - DNI: " + cliente.getDni());
        System.out.println("Banco: " + banco.getNombre() + " (CUIT: " + banco.getCuit() + ")");
    }
}
