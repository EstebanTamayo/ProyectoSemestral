/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listado;

import Entidades.TipoEquipo;
import Entidades.Ventilador;
import Entidades.VentiladorItemDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import proyectosemestral.DataConnection;

/**
 *
 * @author mauri
 */
public class ListadoDataModel {
 
    public ArrayList<VentiladorItemDTO> getVentiladoresItems(){
        
        ArrayList<VentiladorItemDTO> lista = new ArrayList<>();
        
        try{
            String sql = "SELECT id, modelo, marca, TipoEquipo, Instalacion, precio FROM Ventiladores";
            Connection connection = DriverManager.getConnection( DataConnection.stringDB, 
                    DataConnection.user,DataConnection.pass );

            Statement statement = connection.prepareStatement( sql );
            ResultSet resultSet = statement.executeQuery( sql );

            while( resultSet.next() )
            {   
                lista.add(new VentiladorItemDTO(
                        resultSet.getInt(1 ), 
                        resultSet.getString( 2 ),
                        resultSet.getString( 3 ),
                        resultSet.getString( 4),
                        resultSet.getBoolean(5),
                        resultSet.getInt(6)
                    )
                );
            }
            
            connection.close();
        }
          catch ( Exception ex )
        {
          ex.printStackTrace();
        }
        
        return lista;
    }
    
    public ArrayList<Ventilador> getVentiladorFilter(String filter){
        ArrayList<Ventilador> lista = new ArrayList<Ventilador>();
        
          
        try{
            String sql = "SELECT codigo, categoria, capacidad, TipoEquipo, EspacioMaximo, marca, modelo, ControlRemoto, Instalacion, precio, ancho, alto, descripcion, refrigerante FROM Ventiladores WHERE " + filter;
            
            Connection connection = DriverManager.getConnection( DataConnection.stringDB, 
                    DataConnection.user,DataConnection.pass );

            Statement statement = connection.prepareStatement( sql );
            ResultSet resultSet = statement.executeQuery( sql );
            
            while( resultSet.next() )
            {   
                lista.add(new Ventilador(
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
                ));
            }
            
            connection.close();
        }
          catch ( Exception ex )
        {
          ex.printStackTrace();
        }
        
        return lista;
    }
    
    public boolean deleteItem(int id) {
        
        boolean value = false;
        
        try{
            Connection connection = DriverManager.getConnection( DataConnection.stringDB, 
                    DataConnection.user,DataConnection.pass );
            
            String sqlDELETE = "DELETE FROM ventiladores WHERE id = " + id;
            PreparedStatement statementDELETE = connection.prepareStatement( sqlDELETE );
            int rowCount = statementDELETE.executeUpdate();
             
            value = rowCount > 0;
            
            connection.close();
        }
          catch ( Exception ex )
        {
          ex.printStackTrace();
        }
        
        return value;
    }
    
    public ArrayList<String> getMarcas(){
        
        ArrayList<String> lista = new ArrayList<>();
        
        try{
            String sql = "SELECT marca FROM ventiladores";
            Connection connection = DriverManager.getConnection( DataConnection.stringDB, 
                    DataConnection.user,DataConnection.pass );

            Statement statement = connection.prepareStatement( sql );
            ResultSet resultSet = statement.executeQuery( sql );

            while( resultSet.next() )
            {
                lista.add(resultSet.getString(1));
            }

            connection.close();
        }
          catch ( Exception ex )
        {
          ex.printStackTrace();
        }
        
        return lista;
    }
    
    public ArrayList<String> getModelos(){
        
        ArrayList<String> lista = new ArrayList<>();
        
        try{
            String sql = "SELECT modelo FROM ventiladores";
            Connection connection = DriverManager.getConnection( DataConnection.stringDB, 
                    DataConnection.user,DataConnection.pass );

            Statement statement = connection.prepareStatement( sql );
            ResultSet resultSet = statement.executeQuery( sql );

            while( resultSet.next() )
            {
                lista.add(resultSet.getString(1));
            }

            connection.close();
        }
          catch ( Exception ex )
        {
          ex.printStackTrace();
        }
        
        return lista;
    }
}
