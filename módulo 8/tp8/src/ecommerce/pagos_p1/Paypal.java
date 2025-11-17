/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce.pagos_p1;

import ecommerce.interfaces_p1.Pago;

/**
 *
 * @author herre
 */
public class Paypal implements Pago {
    private final String usuario;

    public Paypal(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago por PayPal del usuario " + usuario + " procesado por $" + monto);
    }
}
 
