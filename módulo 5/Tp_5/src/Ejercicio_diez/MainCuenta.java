/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_diez;

/**
 *
 * @author herre
 */
public class MainCuenta {

    public static void main(String[] args) {
        Titular titular = new Titular("Luis Martínez", "46900555");
        CuentaBancaria cuenta = new CuentaBancaria("0123456789012345678901", 150000.50, titular, "ABC123", "30/10/2025");

        cuenta.mostrarDatos();
    }
}
