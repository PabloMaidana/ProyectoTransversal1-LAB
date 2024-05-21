/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;

import entidades.Inscripcion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class InscripcionData {
    private Connection con = null;

    public InscripcionData() {
        con = Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion insc){
        String sql = "INSERT INTO inscripcion(nota, idAlumno, idMateria) "
                + "VALUES (?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            while (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                System.out.println("Se ha creado la inscripcion");
            }
        } catch (SQLException ex) {
            System.out.println("Error al acceder a la tabla, Error: " + ex);
        }
    }
    
    public void actualizarNota(int idAlumno,int idMateria,double nota){
        String sql = "UPDATE inscripcion SET nota = ?"
                + "WHERE idMateria = ? AND idAlumno = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2,idMateria);
            ps.setInt(3,idAlumno);
            int filas = ps.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Se ha actualizado la nota");
            }
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al acceder a la tabla, Error: " + ex);
        }
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            
        }catch(SQLException ex){
            System.out.println("Error al acceder a la tabla, Error: " + ex);
        }
    }
    
}
