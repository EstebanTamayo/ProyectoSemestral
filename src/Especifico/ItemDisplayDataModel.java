/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Especifico;

import Entidades.Ventilador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import proyectosemestral.DataConnection;

/**
 *
 * @author mauri
 */
public class ItemDisplayDataModel {
    public Ventilador getVentilador(int index){
        Ventilador v = new Ventilador();
        
        try{
            String sql = "SELECT codigo, categoria, capacidad, TipoEquipo, EspacioMaximo, marca, modelo, ControlRemoto, Instalacion, precio, ancho, alto, descripcion, refrigerante FROM ventiladores WHERE id = " + index;
            Connection connection = DriverManager.getConnection( DataConnection.stringDB, 
                    DataConnection.user,DataConnection.pass );

            Statement statement = connection.prepareStatement( sql );
            ResultSet resultSet = statement.executeQuery( sql );

            if( resultSet.next() )
            {   
                v = new Ventilador(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getInt(3),
                    resultSet.getString(4),
                    resultSet.getInt(5),
                    resultSet.getString(6),
                    resultSet.getString(7),
                        
                    resultSet.getBoolean(8),
                    resultSet.getBoolean(9),
                    resultSet.getInt(10),
                    resultSet.getInt(11),
                    resultSet.getInt(12),
                    resultSet.getString(13),
                    resultSet.getString(14)
                );
            }
            
            connection.close();
        }
          catch ( Exception ex )
        {
          ex.printStackTrace();
        }
        
        return v;
    }
    
    public boolean addComparacion(int ventiladorId){
         try{
            Connection connection = DriverManager.getConnection( DataConnection.stringDB, 
                    DataConnection.user,DataConnection.pass );
            
            String sqlDELETE = "DELETE FROM usuariocomparar WHERE UsuarioId = " + DataConnection.userId + " AND VentiladorID = " + ventiladorId;
            PreparedStatement statementDELETE = connection.prepareStatement( sqlDELETE );
            statementDELETE.executeUpdate();
             
            String sql = "INSERT INTO usuariocomparar(UsuarioId, VentiladorID) VALUES(?, ?)";
            PreparedStatement statement = connection.prepareStatement( sql );
             
            statement.setInt(1, DataConnection.userId);
            statement.setInt(2, ventiladorId);
            statement.executeUpdate();
            connection.close();
            return true;
        }
          catch ( Exception ex )
        {
          ex.printStackTrace();
          return false;
        }
    }
    
    public boolean getFavorite(int favoritoId){
        
        Boolean value = false;
        
        try{
            String sql = "SELECT Favorito FROM usuariofavorito WHERE UsuarioId = " + DataConnection.userId + " AND VentiladorID = " + favoritoId;
            Connection connection = DriverManager.getConnection( DataConnection.stringDB, 
                    DataConnection.user,DataConnection.pass );

            Statement statement = connection.prepareStatement( sql );
            ResultSet resultSet = statement.executeQuery( sql );

            if( resultSet.next() )
            {
                value = resultSet.getBoolean(1 );
            }

            connection.close();
        }
          catch ( Exception ex )
        {
          ex.printStackTrace();
        }
        
        return value;
    }
    
    public boolean addFavorito(int favoritoId, boolean isFavorite){
         try{
            Connection connection = DriverManager.getConnection( DataConnection.stringDB, 
                    DataConnection.user,DataConnection.pass );
            
            String sqlDELETE = "DELETE FROM usuariofavorito WHERE UsuarioId = " + DataConnection.userId + " AND VentiladorID = " + favoritoId;
            PreparedStatement statementDELETE = connection.prepareStatement( sqlDELETE );
            statementDELETE.executeUpdate();
             
            String sql = "INSERT INTO usuariofavorito(UsuarioId, VentiladorID, Favorito) VALUES(?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement( sql );
             
            statement.setInt(1, DataConnection.userId);
            statement.setInt(2, favoritoId);
            statement.setBoolean(3, isFavorite);
            statement.executeUpdate();
            connection.close();
            return true;
        }
          catch ( Exception ex )
        {
          ex.printStackTrace();
          return false;
        }
    }
}
