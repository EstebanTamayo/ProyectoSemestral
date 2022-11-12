/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

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
public class LoginDataModel {
  
   
    public boolean getUser(String user, String password){
      
      boolean userExist = false;
      try{
        String sql = "SELECT usuario, password FROM usuarios WHERE usuario = '" + user + "'";
        Connection connection = DriverManager.getConnection( DataConnection.stringDB, 
                DataConnection.user,DataConnection.pass );

        Statement statement = connection.prepareStatement( sql );
        ResultSet resultSet = statement.executeQuery( sql );

        if( resultSet.next() )
        {
          String userDB = resultSet.getString( 1 );
          String passDB = resultSet.getString( 2 );
          
          if(password.equals(passDB)){
              userExist = true;
          }
        }
          
        connection.close();
        }
          catch ( Exception ex )
        {
          ex.printStackTrace();
        }
      return userExist;
    }
}
