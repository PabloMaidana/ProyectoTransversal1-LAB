/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectotransversal1;

import accesodatos.AlumnoData;
import accesodatos.InscripcionData;
import accesodatos.MateriaData;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author pablo
 */
public class ProyectoTransversal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoData controlAlumno = new AlumnoData();
        Alumno alumno1 = new Alumno(1,123,"Callegaro","Marti",LocalDate.of(2002,03,29),true);
        Alumno alumno2 = new Alumno(2,124,"Maidana","Pablo",LocalDate.of(2002,03,19),true);
//      controlAlumno.guardarAlumno(alumno1);
//      controlAlumno.guardarAlumno(alumno2);
//      controlAlumno.actualizarAlumno(alumno1);
//      controlAlumno.eliminarAlumno(2);
//      if (controlAlumno.buscarAlumno(2)!=null) {
//            System.out.println(controlAlumno.buscarAlumno(2).toString());
//      }
//        
//        
//        System.out.println(controlAlumno.buscarAlumnoPorDni(123).toString());
        
//        List<Alumno> alumnos = controlAlumno.listarAlumnos();
//        for (Alumno a:alumnos) {
//            System.out.println(a.toString());
//        }
      

//      MateriaData materia = new MateriaData();
        Materia mat1 = new Materia(1,"Matematica",2,true);
//      materia.guardarMateria(mat1);

        MateriaData controlMateria = new MateriaData();
//        Materia mat1 = new Materia(1,"Matematica",4,true);
//        controlMateria.guardarMateria(mat1);
//        controlMateria.actualizarMateria(mat1);

//         if (controlMateria.buscarMateria(1)!= null) {
//            System.out.println(controlMateria.buscarMateria(1).toString());
//        }

        
        InscripcionData controlInscripcion = new InscripcionData();
        Inscripcion insc1 = new Inscripcion(alumno2,mat1,7.5);
//      controlInscripcion.guardarInscripcion(insc1);

//        controlInscripcion.actualizarNota(2, 1, 8);
        Materia mat2 = new Materia(2,"Algoritmos",2,true);
        Materia mat3 = new Materia(3,"Web",1,true);
//        controlMateria.guardarMateria(mat3);
//        controlMateria.guardarMateria(mat2);
        Inscripcion insc2 = new Inscripcion(alumno1,mat2,9);
        Inscripcion insc3 = new Inscripcion(alumno1,mat3,8);
//        controlInscripcion.guardarInscripcion(insc3);
//        controlInscripcion.guardarInscripcion(insc2);
//        List<Inscripcion> inscripciones = controlInscripcion.obtenerInscripcionesPorAlumno(1);
//        for (Inscripcion i:inscripciones) {
//            System.out.println(i.toString());
//        }
//        List<Materia> materiasCursadas = controlInscripcion.obtenerMateriasNoCursadas(2);
//        for (Materia i:materiasCursadas) {
//            System.out.println(i.toString());
//        }
//          List<Alumno> alumnosPorMateria = controlInscripcion.obtenerAlumnosPorMateria(3);
//          for(Alumno i:alumnosPorMateria){
//              System.out.println(i.toString());
//          }
          controlInscripcion.eliminarInscripcionMateriaAlumno(1, 2);
    }
       
}
