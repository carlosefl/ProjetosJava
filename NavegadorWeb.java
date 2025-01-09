package com.example.javafxdemo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.geometry.Pos;
import javafx.geometry.Insets;


public class NavegadorWeb extends Application {


    @Override
    public void start(Stage janela){


    TextField campoUrl = new TextField();
    campoUrl.setPromptText("Insira o Endereço");
    WebView navegadpr = new WebView();
    WebEngine motor = navegadpr.getEngine();



     campoUrl.setOnAction(evento -> motor.load(formataUrl(campoUrl.getText())));

     VBox vBox = new VBox();
     vBox.getChildren().addAll(campoUrl,navegadpr);
     vBox.setAlignment(Pos.CENTER);
     vBox.setPadding(new Insets(10));
     Scene scene = new Scene(vBox);
     janela.setScene(scene);
     janela.setTitle("navegador");
     janela.show();
    }
    public String formataUrl (String url){

        if (!url.startsWith("http://") && !url.startsWith("https://")){
          url = "http://" + url;

        }
        return url ;

    }

    public static void main(String[] args) {
        launch(args);
    }

}
