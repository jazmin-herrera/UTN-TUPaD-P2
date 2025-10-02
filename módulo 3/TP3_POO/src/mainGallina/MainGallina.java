/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainGallina;

/**
 *
 * @author herre
 */
public class MainGallina {
    
    public static void main(String[] args) {
        Gallina g = new Gallina();
        g.setIdGallina("abc123");
        g.setEdad(1);
        g.setHuevosPuestos(0);

        Gallina g2 = new Gallina();
        g2.setIdGallina("abc124");
        g2.setEdad(2);
        g2.setHuevosPuestos(5);

        // Estado inicial
        g.mostrarEstado();
        g2.mostrarEstado();

        // Ponen huevos
        g.ponerHuevo();
        g.ponerHuevo();
        g.ponerHuevo();

        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.ponerHuevo();

        // Envejecen
        g.envejecer();
        g2.envejecer();

        // Estado final
        g.mostrarEstado();
        g2.mostrarEstado();
    }
}
    
    

