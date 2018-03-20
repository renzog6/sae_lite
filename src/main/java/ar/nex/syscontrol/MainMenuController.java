/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.nex.syscontrol;

import static ar.nex.syscontrol.MainApp.stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Renzo
 */
public class MainMenuController implements Initializable {

    @FXML
    Button btnPartidos;
    @FXML
    Button btnClientes;
    @FXML
    Button btnCaja;
    @FXML
    Button btnConfig;

    @FXML
    public void goPartidos() throws IOException {
        try {
            boolean isLogin = true;
            if (isLogin) {
                MainApp.showHome();
            } else {
                System.out.println("ar.nex.syscontrol.MainMenuController.goSignIn(): ERROR");
            }
        } catch (Exception e) {
            System.out.println("ar.nex.syscontrol.MainMenuController.goSignIn(): ERROR");
            e.printStackTrace();
        }
    }

    @FXML
    public void goClientes() throws IOException {
        try {
            boolean isLogin = true;
            if (isLogin) {
                MainApp.showClientes();
            } else {
                System.out.println("ar.nex.syscontrol.MainMenuController.goSignIn(): ERROR");
            }
        } catch (Exception e) {
            System.out.println("ar.nex.syscontrol.MainMenuController.goSignIn(): ERROR");
            e.printStackTrace();
        }
    }

    @FXML
    public void goConfig() throws IOException {
        try {
            System.out.println("ar.nex.syscontrol.MainMenuController.goConfig()");
            MainApp.showConfig();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb
    ) {
        // TODO
    }

}
