/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;
import entidades.Materia;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author pablo
 */
public class MateriaData {
    private Connection con = null;

    public MateriaData() {
        this.con = Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
        String sql = "INSERT INTO materia (nombre, año, estado) VALUES (?,?,?)";
        
        try{
           PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setString(1, materia.getNombre());
           ps.setInt(2,materia.getAnio());
           ps.setBoolean(3, true);
           ps.executeUpdate();
           ResultSet rs = ps.getGeneratedKeys();
           while (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia guardada");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia");
        
    }
        
    }
    
    public Materia buscarMateria(int id){
        Materia materia = null;
        
        try{
            String sql = "SELECT nombre, año, estado FROM materia WHERE idMateria = ? AND estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
        if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setEstado(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "No existe la materia con id: " + id);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia");
        }
        return materia;
        
    }
    
    public void actualizarMateria(Materia materia){
        try{
            String sql = "UPDATE materia SET nombre= ?, año= ? WHERE idMateria = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1,materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setInt(3, materia.getIdMateria());
            
            int fila = ps.executeUpdate();
            
            if (fila ==1) {
                JOptionPane.showMessageDialog(null, "Materia modificada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia");
        }  
    }
     
}
