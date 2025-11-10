/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

/**
 *
 * @author herre
 */
public class Celular {
    private final String imei;
    private final String marca;
    private final String modelo;
    private final Bateria bateria; // Agregación
    private final Usuario usuario; // Asociación bidireccional

    public Celular(String imei, String marca, String modelo, Usuario usuario, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.usuario = usuario;
        this.bateria = bateria;
        usuario.setCelular(this);
    }

    public void mostrarDatos() {
        System.out.println("Celular: " + marca + " " + modelo + " (IMEI: " + imei + ")");
        System.out.println("Usuario: " + usuario.getNombre() + " - DNI: " + usuario.getDni());
        System.out.println("Batería: " + bateria.getModelo() + " - " + bateria.getCapacidad() + " mAh");
    }
}

