/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;
import entidades.Alumno;
import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author pablo
 */
public class AlumnoData {
    private Connection con = null;

    public AlumnoData() {
        con = Conexion.getConexion();
    }
    
    public void guardarAlumno(Alumno alumno){
        String sql = "INSERT INTO alumno (dni,apellido,nombre,fechaNac,estado) "
                + "VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2,alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFecha()));
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
   
}
