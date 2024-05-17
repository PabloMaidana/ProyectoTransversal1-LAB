/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectotransversal1;

import accesodatos.AlumnoData;
import entidades.Alumno;
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
        
        List<Alumno> alumnos = controlAlumno.listarAlumnos();
        for (Alumno a:alumnos) {
            System.out.println(a.toString());
        }
    }
    
}
