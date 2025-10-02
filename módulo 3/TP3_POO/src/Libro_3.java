/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author herre
 */
public final class Libro_3 {
    private final String titulo;
    private final String autor;
    private int anioPublicacion;

    // Constructor
    public Libro_3(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    // Getter y Setter
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    // Método
    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + anioPublicacion);
    }

    // Main
    public static void main(String[] args) {
        Libro_3 libro1 = new Libro_3("Cien años de soledad", "Gabriel García Márquez", 0);
        libro1.mostrarInformacion();

        libro1.setAnioPublicacion(1967);
        libro1.mostrarInformacion();
    }
}



    
    

