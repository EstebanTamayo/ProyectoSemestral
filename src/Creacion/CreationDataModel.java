/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creacion;

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
public class CreationDataModel {
    
    public ArrayList<Categoria> getCategorias(){
        
        ArrayList<Categoria> lista = new ArrayList<>();
        
        try{
            String sql = "SELECT id, descripcion FROM CategoriaEquipo";
            Connection connection = DriverManager.getConnection( DataConnection.stringDB, 
                    DataConnection.user,DataConnection.pass );

            Statement statement = connection.prepareStatement( sql );
            ResultSet resultSet = statement.executeQuery( sql );

            while( resultSet.next() )
            {
                lista.add(new Categoria(
                        resultSet.getInt(1 ), 
                        resultSet.getString( 2 )
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
    
    public ArrayList<TipoEquipo> getTipoEquipos(){
        
        ArrayList<TipoEquipo> lista = new ArrayList<>();
        
        try{
            String sql = "SELECT id, name FROM TipoEquipo";
            Connection connection = DriverManager.getConnection( DataConnection.stringDB, 
                    DataConnection.user,DataConnection.pass );

            Statement statement = connection.prepareStatement( sql );
            ResultSet resultSet = statement.executeQuery( sql );

            while( resultSet.next() )
            {
                lista.add(new TipoEquipo(
                        resultSet.getInt(1 ), 
                        resultSet.getString( 2 )
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

    public ArrayList<Refrigerante> getRefrigerantes() {
         ArrayList<Refrigerante> lista = new ArrayList<>();
        
        try{
            String sql = "SELECT id, name FROM Refrigerantes";
            Connection connection = DriverManager.getConnection( DataConnection.stringDB, 
                    DataConnection.user,DataConnection.pass );

            Statement statement = connection.prepareStatement( sql );
            ResultSet resultSet = statement.executeQuery( sql );

            while( resultSet.next() )
            {
                lista.add(new Refrigerante(
                        resultSet.getInt(1 ), 
                        resultSet.getString( 2 )
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
    
    public ArrayList<Capacidad> getCapacidades() {
         ArrayList<Capacidad> lista = new ArrayList<>();
        
        try{
            String sql = "SELECT id, capacidad FROM Capacidad";
            Connection connection = DriverManager.getConnection( DataConnection.stringDB, 
                    DataConnection.user,DataConnection.pass );

            Statement statement = connection.prepareStatement( sql );
            ResultSet resultSet = statement.executeQuery( sql );

            while( resultSet.next() )
            {
                lista.add(new Capacidad(
                        resultSet.getInt(1 ), 
                        resultSet.getInt(2 )
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
    
    public boolean addVentilador(Ventilador ventilador){
         try{
            String sql = "INSERT INTO ventiladores(codigo, categoria, capacidad, TipoEquipo, EspacioMaximo, marca, modelo, ControlRemoto, Instalacion, precio, ancho, alto, descripcion, refrigerante) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            Connection connection = DriverManager.getConnection( DataConnection.stringDB, 
                    DataConnection.user,DataConnection.pass );

            PreparedStatement statement = connection.prepareStatement( sql );
            
            statement.setString(1, ventilador.getCodigo());
            statement.setString(2, ventilador.getCategoria());
            statement.setInt(3, ventilador.getCapacidad());
            statement.setString(4, ventilador.getTipoEquipo());
            statement.setDouble(5, ventilador.getEspacioMaximo());
            statement.setString(6, ventilador.getMarca());
            statement.setString(7, ventilador.getModelo());
            statement.setBoolean(8, ventilador.isControlRemoto());
            statement.setBoolean(9, ventilador.isInstalacion());
            statement.setInt(10, ventilador.getPrecio());
            statement.setDouble(11, ventilador.getAncho());
            statement.setDouble(12, ventilador.getAlto());
            statement.setString(13, ventilador.getDescripcion());
            statement.setString(14, ventilador.getRefrigerante());
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
