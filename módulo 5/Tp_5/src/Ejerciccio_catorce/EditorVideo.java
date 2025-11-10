/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejerciccio_catorce;

/**
 *
 * @author herre
 */
public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        System.out.println("Exportando proyecto: " + render.getProyecto().getNombre());
        System.out.println("Duración: " + render.getProyecto().getDuracionMin() + " min");
        System.out.println("Formato de exportación: " + render.getFormato());
    }

    void exportar(String mP4, Proyecto proyecto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
