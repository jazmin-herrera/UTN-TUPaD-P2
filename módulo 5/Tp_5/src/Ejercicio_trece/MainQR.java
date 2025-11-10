/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_trece;

/**
 *
 * @author herre
 */
public class MainQR {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Carlos López", "carlos@example.com");
        GeneradorQR generador = new GeneradorQR();

        // Genera y muestra el QR
        generador.generar("QR-2025-XYZ", usuario);
    }
}
