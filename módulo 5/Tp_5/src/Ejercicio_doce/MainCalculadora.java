/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_doce;

/**
 *
 * @author herre
 */
public class MainCalculadora {

    
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Laura Pérez", "20-45678901-3");
        Impuesto impuesto = new Impuesto(10000, contribuyente);

        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
    }
}
