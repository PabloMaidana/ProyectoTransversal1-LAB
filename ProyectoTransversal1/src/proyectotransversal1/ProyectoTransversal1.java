/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectotransversal1;

import accesodatos.AlumnoData;
import entidades.Alumno;
import java.time.LocalDate;

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
        Alumno alumno1 = new Alumno(10,123,"Callegaro","Martina",LocalDate.of(2024,03,29),true);
        controlAlumno.guardarAlumno(alumno1);
    }
    
}
