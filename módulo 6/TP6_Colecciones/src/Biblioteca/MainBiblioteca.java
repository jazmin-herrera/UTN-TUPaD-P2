/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Biblioteca;

import java.util.List;

public class MainBiblioteca {
    public static void main(String[] args) {
        // 1. Creamos una biblioteca.
        Biblioteca bib = new Biblioteca("Biblioteca Central");

        // 2. Crear al menos tres autores
        Autor a1 = new Autor("A001", "Gabriel García Márquez", "Colombia");
        Autor a2 = new Autor("A002", "J. K. Rowling", "Reino Unido");
        Autor a3 = new Autor("A003", "George Orwell", "Reino Unido");

        // 3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        bib.agregarLibro("ISBN001", "Cien años de soledad", 1967, a1);
        bib.agregarLibro("ISBN002", "Crónica de una muerte anunciada", 1981, a1);
        bib.agregarLibro("ISBN003", "Harry Potter y la piedra filosofal", 1997, a2);
        bib.agregarLibro("ISBN004", "1984", 1949, a3);
        bib.agregarLibro("ISBN005", "Animal Farm", 1945, a3);

        // 4. Listar todos los libros con su información y la del autor.
        System.out.println("LISTADO DE LIBROS:");
        bib.listarLibros();
        System.out.println();

        // 5. Buscar un libro por su ISBN y mostrar su información.
        System.out.println("BUSCAR ISBN003:");
        Libro l = bib.buscarLibroPorIsbn("ISBN003");
        if (l != null) l.mostrarInfo(); else System.out.println("No encontrado.");
        System.out.println();

        // 6. Filtrar y mostrar los libros publicados en un año específico.
        System.out.println("FILTRAR LIBROS DEL AÑO 1949:");
        List<Libro> filtrados = bib.filtrarLibrosPorAnio(1949);
        filtrados.forEach(Libro::mostrarInfo);
        System.out.println();

        // 7. Eliminar un libro por su ISBN y listar los libros restantes.
        System.out.println("ELIMINAR ISBN002:");
        boolean eliminado = bib.eliminarLibro("ISBN002");
        System.out.println("Eliminado? " + eliminado);
        System.out.println("LIBROS RESTANTES:");
        bib.listarLibros();
        System.out.println();

        // 8. Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("CANTIDAD TOTAL DE LIBROS: " + bib.obtenerCantidadLibros());
        System.out.println();

        // 9. Listar todos los autores de los libros disponibles en la biblioteca.
        bib.mostrarAutoresDisponibles();
    }
}