/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_diez;

/**
 *
 * @author herre
 */
public class CuentaBancaria {
    private final String cbu;
    private final double saldo;
    private final ClaveSeguridad clave; // Composición
    private final Titular titular;      // Asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, Titular titular, String codigoClave, String fechaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigoClave, fechaModificacion);
        this.titular = titular;
        titular.setCuenta(this);
    }

    public void mostrarDatos() {
        System.out.println("Cuenta Bancaria CBU: " + cbu + " | Saldo: $" + saldo);
        System.out.println("Titular: " + titular.getNombre() + " - DNI: " + titular.getDni());
        System.out.println("Clave: " + clave.getCodigo() + " | Última modificación: " + clave.getUltimaModificacion());
    }
}
