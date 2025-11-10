/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;


class Curso {
   private final String codigo;
    private final String nombre;
    private Profesor profesor; // puede ser null

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        if (this.profesor == p) return;

        // Si tenía profesor previo, quitarnos de su lista
        if (this.profesor != null) {
            Profesor viejo = this.profesor;
            this.profesor = null; // evitar recursión
            viejo.getCursos().remove(this);
        }

        // Asignar nuevo profesor y sincronizar
        this.profesor = p;
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this);
        }
    }

    public void mostrarInfo() {
        System.out.printf("Curso[codigo=%s, nombre=%s, profesor=%s]%n",
                codigo, nombre, (profesor != null ? profesor.getNombre() : "Sin asignar"));
    }

    @Override
    public String toString() {
        return String.format("Curso[codigo=%s, nombre=%s]", codigo, nombre);
    }

    String getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
} 

