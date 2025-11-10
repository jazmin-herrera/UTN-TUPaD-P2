/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_trece;

/**
 *
 * @author herre
 */
public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valor, usuario);
        System.out.println("Código QR generado con valor: " + codigo.getValor());
        System.out.println("Propietario: " + codigo.getUsuario().getNombre() +
                " (" + codigo.getUsuario().getEmail() + ")");
    }
}
