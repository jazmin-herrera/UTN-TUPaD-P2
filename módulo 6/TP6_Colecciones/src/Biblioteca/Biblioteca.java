/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private final ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        // Evitar duplicados por ISBN
        if (buscarLibroPorIsbn(isbn) == null) {
            libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
        } else {
            System.out.println("Ya existe un libro con ISBN: " + isbn);
        }
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        libros.forEach(Libro::mostrarInfo);
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) return l;
        }
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        Libro l = buscarLibroPorIsbn(isbn);
        if (l != null) {
            libros.remove(l);
            return true;
        }
        return false;
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        return libros.stream()
                .filter(l -> l.getAnioPublicacion() == anio)
                .collect(Collectors.toList());
    }

    public void mostrarAutoresDisponibles() {
        List<Autor> autores = libros.stream()
                .map(Libro::getAutor)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Autores en la biblioteca:");
        autores.forEach(Autor::mostrarInfo);
    }
}