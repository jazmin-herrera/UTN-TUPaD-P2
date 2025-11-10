/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Universidad;

public class MainUniversidad {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Tecnológica");

        // 1. Crear al menos 3 profesores y 5 cursos.
        Profesor prof1 = new Profesor("PR001", "Ana Torres", "Matemáticas");
        Profesor prof2 = new Profesor("PR002", "Carlos Méndez", "Programación");
        Profesor prof3 = new Profesor("PR003", "Lucía Pérez", "Redes");

        Curso c1 = new Curso("C001", "Álgebra I");
        Curso c2 = new Curso("C002", "Programación I");
        Curso c3 = new Curso("C003", "Sistemas Operativos");
        Curso c4 = new Curso("C004", "Redes de Computadores");
        Curso c5 = new Curso("C005", "Estructuras de Datos");

        // 2. Agregar profesores y cursos a la universidad.
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3. Asignar profesores a cursos usando asignarProfesorACurso(...).
        uni.asignarProfesorACurso("C001", "PR001");
        uni.asignarProfesorACurso("C002", "PR002");
        uni.asignarProfesorACurso("C005", "PR002");
        uni.asignarProfesorACurso("C004", "PR003");

        // 4. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("=== LISTAR CURSOS ===");
        uni.listarCursos();
        System.out.println();
        System.out.println("=== LISTAR PROFESORES ===");
        uni.listarProfesores();

        // 5. Cambiar el profesor de un curso y verificar sincronización.
        System.out.println("=== REASIGNAR C002 a PR003 ===");
        uni.asignarProfesorACurso("C002", "PR003"); // ahora C002 pasa a PR003
        uni.listarCursos();
        System.out.println();
        System.out.println("Profesores después de reasignar:");
        uni.listarProfesores();

        // 6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("=== ELIMINAR CURSO C005 ===");
        uni.eliminarCurso("C005");
        uni.listarCursos();
        System.out.println();
        System.out.println("Profesores después de eliminar C005:");
        uni.listarProfesores();

        // 7. Remover un profesor y dejar profesor = null en sus cursos.
        System.out.println("=== ELIMINAR PROFESOR PR003 ===");
        uni.eliminarProfesor("PR003");
        uni.listarCursos();
        System.out.println();
        uni.listarProfesores();

        // 8. Mostrar un reporte: cantidad de cursos por profesor.
        uni.reporteCantidadCursosPorProfesor();
    }
}