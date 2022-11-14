/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparar;

import Entidades.VentiladorCompareDTO;
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
public class CompararDataModel {

    ArrayList<VentiladorCompareDTO> getComparaciones() {
        ArrayList<VentiladorCompareDTO> lista = new ArrayList<>();
        
        try{
            String sql = "SELECT id, modelo, marca, TipoEquipo, descripcion, precio FROM Ventiladores v\n" +
                        "JOIN usuariocomparar uc ON (v.id = uc.VentiladorID)\n" +
                        "WHERE uc.UsuarioId = " + DataConnection.userId;
            
            Connection connection = DriverManager.getConnection( DataConnection.stringDB, 
                    DataConnection.user,DataConnection.pass );

            Statement statement = connection.prepareStatement( sql );
            ResultSet resultSet = statement.executeQuery( sql );

            while( resultSet.next() )
            {   
                lista.add(new VentiladorCompareDTO(
                        resultSet.getInt(1 ), 
                        resultSet.getString( 2 ),
                        resultSet.getString( 3 ),
                        resultSet.getString( 4),
                        resultSet.getString(5),
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

    public boolean deleteComparacion(int id) {
        
        boolean value = false;
        
        try{
            Connection connection = DriverManager.getConnection( DataConnection.stringDB, 
                    DataConnection.user,DataConnection.pass );
            
            String sqlDELETE = "DELETE FROM usuariocomparar WHERE UsuarioId = " + DataConnection.userId + " AND VentiladorID = " + id;
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
