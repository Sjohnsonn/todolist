package com.example.todolist;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    public ChoiceBox datePicker;
    public ListView allYourTasks;
    public TextField typeYourTaskHere;

    public void initialize(){
        datePicker.setItems(FXCollections.observableArrayList(
                "Sunday", "Monday ","Tuesday","Wednesday","Thursday","Friday","Saturday"));
    }

    public void addTask() {
        System.out.println("Hi siraj");

        String day = (String) datePicker.getValue();
        String task = typeYourTaskHere.getText();

        allYourTasks.getItems().add(day+task);
    }
}