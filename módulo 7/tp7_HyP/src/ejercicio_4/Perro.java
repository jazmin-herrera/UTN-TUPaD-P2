/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4;

public class Perro extends Animal {
    public Perro() {
        super("Perro");
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau!");
    }
}