package ar.nex.syscontrol.login;

import java.io.IOException;

import ar.nex.syscontrol.MainApp;
import java.util.List;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LoginController {

    @FXML
    Button signInButton;

    @FXML
    TextField usernameBox;

    @FXML
    PasswordField passwordBox;

    @FXML
    Text errorReport;

    @FXML
    void goSignIn() throws IOException {
        try {
            boolean isLogin = true;
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("SysControl.PU");
            UsuarioJpaController jpaUsuario = new UsuarioJpaController(factory);

            List<Usuario> lst = jpaUsuario.findUsuarioEntities();

            if (isLogin) {
                MainApp.showMainMenu();
            } else {
                errorReport.setText("Error! Invalid Username or Password.");
            }
        } catch (Exception e) {
            errorReport.setText("Error! Invalid Username or Password.");
            e.printStackTrace();
        }
    }
}
