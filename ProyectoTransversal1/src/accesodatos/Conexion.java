/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;

import java.sql.*;

/**
 *
 * @author pablo
 */
public class Conexion {
    private static final String URL = "jdbc:mariadb//localhost/";
    private static final String DB = "proyecto_transversal1";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static final Connection connection;

    public Conexion() {
    }
    
    public static Connection getConexion(){
        
    }
}
