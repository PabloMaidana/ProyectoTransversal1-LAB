/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;
import entidades.Alumno;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
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
        Alumno alumno = null;
        try{
            String sql = "SELECT `dni`, `apellido`, `nombre`, `fechaNac` FROM `alumno` WHERE idAlumno = ? AND estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1,id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFecha(rs.getDate("fechaNac").toLocalDate());
                alumno.setEstado(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "No existe el alumno con id: " + id);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No error al acceder a la tabla alumnos");
        }
        return alumno;
    }
    
    public Alumno buscarAlumnoPorDni(int dni){
        Alumno alumno = null;
        try{
            String sql = "SELECT `idAlumno`, dni, `apellido`, `nombre`, `fechaNac` FROM `alumno` WHERE dni = ? AND estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1,dni);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFecha(rs.getDate("fechaNac").toLocalDate());
                alumno.setEstado(true);
                
            }else{
                JOptionPane.showMessageDialog(null,"No existe el alumno con dni: " + dni);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumnos");
        }
        return alumno;
    }
    
    public void eliminarAlumno(int id){
        try{
            String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            int filas = ps.executeUpdate();
            if (filas == 1) {
                System.out.println("Se ha eliminado el alumno");
            }
        }catch(SQLException e){
            System.out.println("");
        }
    }
    
      public List<Alumno> listarAlumnos(){
        List<Alumno> alumnos = new ArrayList<>();
        
        try{
            String sql = "SELECT * FROM `alumno` WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFecha((rs.getDate("fechaNac").toLocalDate()));
                alumno.setEstado(rs.getBoolean("estado"));
                alumnos.add(alumno);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno "+ ex.getMessage());
            
        }
        return alumnos;
        
    }
   
}
