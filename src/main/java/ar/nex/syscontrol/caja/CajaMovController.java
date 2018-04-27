package ar.nex.syscontrol.caja;

import ar.nex.syscontrol.cliente.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import ar.nex.syscontrol.MainApp;
import ar.nex.syscontrol.config.Historial;
import ar.nex.syscontrol.config.HistorialService;
import ar.nex.syscontrol.partido.Partido;
import ar.nex.syscontrol.partido.PartidoJpaController;
import java.util.List;
import java.util.Optional;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CajaMovController implements Initializable {

    private CajaMovService srvCajaMov;
    private HistorialService srvHistorial;

    @FXML
    private TextField searchBox;
    @FXML
    private Button goMenu;
    @FXML
    private Button btnDelete;
    @FXML
    private Button btnUpdate;
    @FXML
    private Button btnAdd;

    ObservableList<CajaMov> data = FXCollections.observableArrayList();
    FilteredList<CajaMov> filteredData = new FilteredList<>(data);

    @FXML
    private TableView<CajaMov> table;
    @FXML
    private TableColumn<?, ?> colFecha;
    @FXML
    private TableColumn<?, ?> colMov;
    @FXML
    private TableColumn<?, ?> colImporte;
    @FXML
    private TableColumn<?, ?> colSaldo;
    @FXML
    private TableColumn<?, ?> colComentario;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        srvCajaMov = new CajaMovService();
        srvHistorial = new HistorialService();
        initTabla();
        loadTabla();
    }

    public void initTabla() {
        colFecha.setCellValueFactory(new PropertyValueFactory<>("fecha"));
        colMov.setCellValueFactory(new PropertyValueFactory<>("mov"));
        colImporte.setCellValueFactory(new PropertyValueFactory<>("importe"));
        colSaldo.setCellValueFactory(new PropertyValueFactory<>("saldo"));
        colComentario.setCellValueFactory(new PropertyValueFactory<>("comentario"));
    }

    public void loadTabla() {
        List<CajaMov> lst = srvCajaMov.Get().findCajaMovEntities();
        for (CajaMov item : lst) {
            data.add(item);
            table.setItems(data);
        }
    }

    @FXML
    private void Delete(ActionEvent event) {
    }

    @FXML
    private void Update(ActionEvent event) {
    }

    @FXML
    private void AddMov(ActionEvent event) {
        
    }

    @FXML
    private void Search(InputMethodEvent event) {
    }

    @FXML
    private void Search(KeyEvent event) {
    }

    @FXML
    private void showOnClick(MouseEvent event) {
    }

    @FXML
    private void goMenu(ActionEvent event) throws IOException {
        MainApp.showMainMenu();
    }
}
