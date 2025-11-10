/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_8;

/**
 *
 * @author herre
 */
public class Documento {
    private final String titulo;
    private final String contenido;
    private final FirmaDigital firma; // Composición

    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fecha, usuario);
    }

    public void mostrarDatos() {
        System.out.println("Documento: " + titulo);
        System.out.println("Contenido: " + contenido);
        System.out.println("Firmado por: " + firma.getUsuario().getNombre() + " (" + firma.getUsuario().getEmail() + ")");
        System.out.println("Código hash: " + firma.getCodigoHash() + " | Fecha: " + firma.getFecha());
    }   
}