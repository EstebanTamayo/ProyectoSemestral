/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import Favoritos.PantallaFavoritos;
import Inicio.PantallaInicio;
import Listado.PantallaLista;

/**
 *
 * @author mauri
 */
public class LoginController {

    private LoginDataModel loginDataModel = new LoginDataModel();
    private Login login;
    
    LoginController(Login login) {
        this.login = login;
    }
   
    public void EnterAction(String user, String pass){
        if(loginDataModel.getUser(user, pass)){
            PantallaInicio p = new PantallaInicio();
            p.setVisible(true);
            login.dispose();
        }
        else
        {
            login.MostrarAlerta();
        }
    }
}
