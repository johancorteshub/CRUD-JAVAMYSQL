/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lucho
 */
public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3306/automotora";
    private static final String USUARIO = "luis";
    private static final String CONTRASENA = "luis123";

    // Método para establecer la conexión a la base de datos
    public static Connection obtenerConexion() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
    }

    

    // Método para cerrar recursos
    public static void cerrarRecursos(ResultSet resultSet, PreparedStatement preparedStatement, Connection conexion) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            System.out.println("Error en clase ConexionBD, metodo cerrarRecursos: " + e);
        }
    }
}
