/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listado;

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
}
