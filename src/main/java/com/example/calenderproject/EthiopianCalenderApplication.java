package com.example.calenderproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EthiopianCalenderApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EthiopianCalenderApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 830, 823);
        stage.setTitle("Ethiopian Calender!");
        stage.setScene(scene); 
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}