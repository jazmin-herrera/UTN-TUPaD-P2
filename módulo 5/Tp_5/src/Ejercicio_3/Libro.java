/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

/**
 *
 * @author herre
 */
public class Libro {
    private final String titulo;
    private final String isbn;
    private final Autor autor;        // Asociación unidireccional
    private final Editorial editorial; // Agregación

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    public void mostrarDatos() {
        System.out.println("Libro: " + titulo + " (ISBN: " + isbn + ")");
        System.out.println("Autor: " + autor.getNombre() + " - " + autor.getNacionalidad());
        System.out.println("Editorial: " + editorial.getNombre() + " - Dirección: " + editorial.getDireccion());
    }
}