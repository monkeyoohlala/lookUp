package com.monkeyoohlala.lookup;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;


import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private TextField lookupDefine;

    @FXML
    private Button lookupDefineButton;

    @FXML
    private TextFlow lookupDefinitionArea;

    @FXML
    private Button lookupDeleteButton;

    @FXML
    private ListView<?> lookupList;

    @FXML
    private TextField lookupSearch;

    @FXML
    private Label lookupStatus;

    public void initialize(URL url, ResourceBundle resourceBundle) {
            loadList();
    }

    private void loadList() {

    }

    @FXML
    void lookUpWord(ActionEvent event) {
        lookupStatus.setText("TEST");
    }



}
