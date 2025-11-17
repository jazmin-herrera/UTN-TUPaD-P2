/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce.pagos_p1;

import ecommerce.interfaces_p1.PagoConDescuento;

/**
 *
 * @author herre
 */
public class TarjetaCredito implements PagoConDescuento {
    private final String titular;

    public TarjetaCredito(String titular) {
        this.titular = titular;
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.9; // 10% de descuento
    }

    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta de " + titular + " procesado por $" + monto);
    }
}
 
    

