/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3;

import java.util.ArrayList;

public class TestEmpleados {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", 120000));
        empleados.add(new EmpleadoTemporal("Luis", 20, 5000));

        for (Empleado e : empleados) {
            e.mostrarSueldo();

            if (e instanceof EmpleadoPlanta) {
                System.out.println("-> Es empleado de planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("-> Es empleado temporal");
            }
        }
    }
}
