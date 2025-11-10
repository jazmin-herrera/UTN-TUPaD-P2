/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_8;

/**
 *
 * @author herre
 */
public class MainDocumento {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("María López", "maria@example.com");
        Documento doc = new Documento("Contrato Laboral", "Contenido del contrato...", "HASH123", "01/10/2025", usuario);

        doc.mostrarDatos();
    }
}
