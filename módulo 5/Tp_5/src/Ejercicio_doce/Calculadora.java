/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_doce;

/**
 *
 * @author herre
 */
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto para: " + impuesto.getContribuyente().getNombre());
        System.out.println("Monto total: $" + impuesto.getMonto());
        double iva = impuesto.getMonto() * 0.21;
        System.out.println("IVA (21%): $" + iva);
        System.out.println("Total a pagar: $" + (impuesto.getMonto() + iva));
    }
}
