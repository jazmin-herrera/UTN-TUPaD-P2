/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_once;

/**
 *
 * @author herre
 */
public class MainReproductor {

    public static void main(String[] args) {
        Artista artista = new Artista("Adele", "Pop");
        Cancion cancion = new Cancion("Hello", artista);

        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
    }
    
}
