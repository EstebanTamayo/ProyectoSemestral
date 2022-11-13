/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Favoritos;

import Entidades.VentiladorItemDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import proyectosemestral.DataConnection;

/**
 *
 * @author mauri
 */
public class FavoritosDataModel {
    public ArrayList<VentiladorItemDTO> getVentiladoresFavorites(){
        
        ArrayList<VentiladorItemDTO> lista = new ArrayList<>();
        
        try{
            String sql = "SELECT id, modelo, marca, TipoEquipo, Instalacion, precio FROM Ventiladores v\n" +
                        "JOIN usuariofavorito uf ON (v.id = uf.VentiladorID)\n" +
                        "WHERE uf.Favorito = 1 AND uf.UsuarioId = " + DataConnection.userId;
            
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
}
