/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private final String id;
    private final String nombre;
    private final String especialidad;
    private final List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this); // sincroniza ambos lados
            }
        }
    }

    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
            if (c.getProfesor() == this) {
                c.setProfesor(null); // deja null en el curso
            }
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println(nombre + " no dicta cursos actualmente.");
            return;
        }
        System.out.println("Cursos de " + nombre + ":");
        for (Curso c : cursos) {
            System.out.printf("- %s : %s%n", c.getCodigo(), c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.printf("Profesor[id=%s, nombre=%s, especialidad=%s, cantidadCursos=%d]%n",
                id, nombre, especialidad, cursos.size());
    }

    @Override
    public String toString() {
        return String.format("Profesor[id=%s, nombre=%s, especialidad=%s]", id, nombre, especialidad);
    }

}