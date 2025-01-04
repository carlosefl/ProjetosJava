package com.example.javafxdemo;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.animation.*;
import javafx.scene.layout.*;
import javafx.geometry.Pos;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import javafx.util.Duration;



public class RelogioDigital extends Application {

    final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    @Override
    public void start(Stage janela){
    Label rotuloTempo = new Label();
    rotuloTempo.setStyle("-fx-font-size: 24; -fx-text-fill: yellow;");

    //criação do keyframe

        KeyFrame keyFrame = new KeyFrame(Duration.ZERO, e -> {rotuloTempo.setText(LocalDateTime.now().format(formatter));});
    //Criação de outro keyfram para duração

        KeyFrame atualizacao = new KeyFrame(Duration.seconds(1));
    // TIMEline
        Timeline relogio = new Timeline();

        relogio.getKeyFrames().addAll(keyFrame,atualizacao);

    //tempo de atualização de hora

    relogio.setCycleCount(Animation.INDEFINITE);
    relogio.play();
    VBox vBox = new VBox(rotuloTempo);
    vBox.setAlignment(Pos.CENTER);
    vBox.setStyle("-fx-background-color: black;");

    Scene scene= new Scene(vBox,300,250);
    janela.setTitle("Relogio");
    janela.setScene(scene);
    janela.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
