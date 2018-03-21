package ar.nex.syscontrol;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    public static Stage stage;
    private static BorderPane mainLayout;

    @Override
    public void start(Stage stage) throws Exception {
        MainApp.stage = stage;
        MainApp.stage.setTitle("SysControl");
        stage.setMaximized(true);
        MainApp.showMain();
        //MainApp.showMainMenu();
        MainApp.showLogin();
        //MainApp.showHome();
    }

    public static void showMain() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("/fxml/MainView.fxml"));
        mainLayout = loader.load();

        Scene scene = new Scene(mainLayout);
        scene.getStylesheets().add("/styles/Styles.css");
        stage.setScene(scene);
        stage.show();
    }

    public static void showMainMenu() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("/fxml/MainMenu.fxml"));
        BorderPane mainItems = loader.load();
        //mainItems.getStylesheets().add("/styles/StylesMainMenu.css");
        mainLayout.setCenter(mainItems);
    }
    
    public static void showPartidos() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("/fxml/partido/Partido.fxml"));
        BorderPane mainItems = loader.load();
        //mainItems.getStylesheets().add("/styles/StylesMainMenu.css");
        mainLayout.setCenter(mainItems);
    }

    public static void showClientes() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("/fxml/Cliente.fxml"));
        BorderPane mainItems = loader.load();
        //mainItems.getStylesheets().add("/styles/StylesMainMenu.css");
        mainLayout.setCenter(mainItems);
    }

    public static void showConfig() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("/fxml/Config.fxml"));
        BorderPane mainItems = loader.load();
        //mainItems.getStylesheets().add("/styles/StylesMainMenu.css");
        mainLayout.setCenter(mainItems);
    }

    public static void showLogin() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("/fxml/Login.fxml"));
        BorderPane mainItems = loader.load();
        mainLayout.setCenter(mainItems);
    }

    public static void showHome() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("/fxml/Home.fxml"));
        BorderPane mainItems = loader.load();
        mainLayout.setCenter(mainItems);
    }

    public static void showInformationAlertBox(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialoge");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
