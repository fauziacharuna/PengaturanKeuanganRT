/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author fauziachmadharuna
 */
public class LaporanController implements Initializable {

    @FXML
    private ScrollPane spp1;
    @FXML
    private TableView<?> tbl_trans;
    @FXML
    private TableColumn<?, ?> clm_tgl;
    @FXML
    private TableColumn<?, ?> clm_nama;
    @FXML
    private TableColumn<?, ?> clm_nom;
    @FXML
    private TableColumn<?, ?> clm_tipe;
    @FXML
    private TableColumn<?, ?> clm_nmuser;
    @FXML
    private JFXButton btnCetak;
    @FXML
    private JFXDatePicker cbtgl1;
    @FXML
    private JFXDatePicker cbtgl12;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void CetakLaporan(ActionEvent event) {
    }
    
}
