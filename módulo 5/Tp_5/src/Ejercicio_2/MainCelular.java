/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_2;

/**
 *
 * @author herre
 */

public class MainCelular {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Sofía Ramírez", "47900888");
        Bateria bateria = new Bateria("Samsung-5000", 5000);
        Celular celular = new Celular("987654321", "Samsung", "Galaxy A54", usuario, bateria);

        celular.mostrarDatos();
    }
}
