/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;
import entidades.Alumno;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
        String sql = "INSERT INTO alumno(dni,apellido,nombre,fechaNac,estado) "
                + "VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2,alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFecha()));
            ps.setBoolean(5, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            while (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno guardado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de alumnos");
        }
    }
    
    public void actualizarAlumno(Alumno alumno){
        try {
            String sql = "UPDATE alumno SET dni= ?,apellido= ?,nombre= ?,fechaNac= ? "
                    + "WHERE idAlumno = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1,alumno.getDni());
            ps.setString(2,alumno.getApellido());
            ps.setString(3,alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFecha()));
            System.out.println(alumno.getIdAlumno());
            
            ps.setInt(5, alumno.getIdAlumno());
            
            int fila = ps.executeUpdate();
            
            if (fila ==1) {
                JOptionPane.showMessageDialog(null, "Alumno modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de alumnos");
        }  
    }
    
    public Alumno buscarAlumno(int id){
        try{
            String sql = "SELECT `dni`, `apellido`, `nombre`, `fechaNac` FROM `alumno` WHERE idAlumno = ?";
            
        }catch(SQLException ex){
            
        }
    }
    
   
}
