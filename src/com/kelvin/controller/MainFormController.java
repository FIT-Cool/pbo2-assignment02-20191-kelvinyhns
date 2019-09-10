package com.kelvin.controller;

import com.kelvin.entity.Item;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class MainFormController implements Initializable {
    @FXML
    private Menu file;
    @FXML
    private Menu edit;
    @FXML
    private Menu help;
    @FXML
    private TableColumn<Item, String> col01;
    @FXML
    private TableColumn<Item, String> col02;
    @FXML
    private TableColumn<Item, String > col03;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtPrice;
    @FXML
    private TextField Category;
    @FXML
    private ChoiceBox pilih;
    @FXML
    private TableView<Item> tableDepartment;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        items = FXCollections.observableArrayList();
        tableDepartment.setItems(items);
    }

    @FXML
    private void ActionSave(ActionEvent actionEvent) {
        Item i = new Item();
        i.setName(txtName.getText().trim());
        item.set
    }
}
