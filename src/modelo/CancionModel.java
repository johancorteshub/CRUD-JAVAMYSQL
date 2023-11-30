/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Lucho
 */
public class CancionModel {

    // agrega canciones a la bd
    public static int agregarCancion(Cancion cancion) {
        String consulta = "INSERT INTO cancion (id, titulo, artista, anio, genero, duracion) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conexion = ConexionBD.obtenerConexion(); PreparedStatement preparedStatement = conexion.prepareStatement(consulta)) {

	    preparedStatement.setInt(1, cancion.getId());
            preparedStatement.setString(2, cancion.getTitulo());
            preparedStatement.setString(3, cancion.getArtista());
            preparedStatement.setInt(4, cancion.getAnio());
            preparedStatement.setString(5, cancion.getGenero());
            preparedStatement.setDouble(6, cancion.getDuracion());

            preparedStatement.executeUpdate();

            return 1;

        } catch (SQLException e) {
            System.out.println("Error en clase CancionModel, metodo agregarCancion: " + e);
            return -1;
        }
    }

    //  modificar cancion en la base de datos
    public static int modificarCancion(Cancion cancion) {
        String consulta = "UPDATE cancion SET titulo=?, artista=?, anio=?, genero=?, duracion=? WHERE id=?";
        System.out.println("modificarCancion" + consulta);
        try (Connection conexion = ConexionBD.obtenerConexion(); PreparedStatement preparedStatement = conexion.prepareStatement(consulta)) {

            preparedStatement.setString(1, cancion.getTitulo());
            preparedStatement.setString(2, cancion.getArtista());
            preparedStatement.setInt(3, cancion.getAnio());
            preparedStatement.setString(4, cancion.getGenero());
            preparedStatement.setDouble(5, cancion.getDuracion());
            preparedStatement.setInt(6, cancion.getId());

            preparedStatement.executeUpdate();
            
            return 1;

        } catch (SQLException e) {
            System.out.println("Error en clase CancionModel, metodo modificarCancion: " + e);
             return -1;
        }
    }

    // eliminar cancion
    public static void eliminarCancion(int id) {
        String consulta = "DELETE FROM cancion WHERE id=?";

        try (Connection conexion = ConexionBD.obtenerConexion(); PreparedStatement preparedStatement = conexion.prepareStatement(consulta)) {

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error en clase cancion, metodo eliminarCancion: " + e);
        }
    }

    //Método para listar Cancion
    public static ArrayList<Cancion> listarCancion() {
        ArrayList<Cancion> cancion = new ArrayList<>();
        String consulta = "SELECT id, titulo, artista, anio, genero, duracion FROM cancion";
        Connection conexion = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            conexion = ConexionBD.obtenerConexion();
            preparedStatement = conexion.prepareStatement(consulta);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Cancion cancion = new cancion();
                cancion.setId(resultSet.getInt("id"));
                cancion.setTitulo(resultSet.getString("titulo"));
                cancion.setArtista(resultSet.getString("artista"));
                cancion.setAnio(resultSet.getInt("anio"));
                cancion.setGenero(resultSet.getString("genero"));
                cancion.setDuracion(resultSet.getDouble("duracion"));

                cancion.add(cancion);

            }

        } catch (SQLException e) {
            System.out.println("Error" + e);
        } finally {
  
            ConexionBD.cerrarRecursos(resultSet, preparedStatement, conexion);
        }
        return cancion;
    }
    
    //  listar 
    public static ArrayList<Cancion> consultarCancion(int id) {
        ArrayList<Cancion> Cancion = new ArrayList<>();
       
        String consulta = "SELECT id, titulo, artista, anio, genero, duracion FROM cancion where id = ? ";
        Connection conexion = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            conexion = ConexionBD.obtenerConexion();
            preparedStatement = conexion.prepareStatement(consulta);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Cancion cancion = new Cancion();
                cancion.setId(resultSet.getInt("id"));
                cancion.setTitulo(resultSet.getString("titulo"));
                cancion.setArtista(resultSet.getString("artista"));
                cancion.setAnio(resultSet.getInt("anio"));
                cancion.setGenero(resultSet.getString("genero"));
                cancion.setDuracion(resultSet.getDouble("duracion"));

                cancion.add(cancion);

            }

        } catch (SQLException e) {
            System.out.println("Error en clase CancionModel " + e);
        } finally {
            // Asegurar el cierre de los recursos en un bloque finally
            ConexionBD.cerrarRecursos(resultSet, preparedStatement, conexion);
        }
        return cancion;
    }
}
