package com.example.javafxdemo;
import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;


public class CalculadoraIMC extends Application {
@Override
    public void start(Stage janela){

    Label etiquetaPeso = new Label("Peso");
    Label etiquetaAltura = new Label("Altura");

    // campos de entrada

    TextField campoPeso = new TextField();
    campoPeso.setPromptText("Peso em Kg");
    TextField campoAltura = new TextField();
    campoAltura.setPromptText("altura em Metros");
    // resultado do imc

    Label resultadoIMC = new Label();

    // Botão para iniciar o processo

    Button botaoCalcular = new Button("Calcular IMC");
    botaoCalcular.setOnAction(e -> {try {

        double peso = Double.parseDouble(campoPeso.getText().replace(',','.'));

    double altura = Double.parseDouble(campoAltura.getText().replace(',','.'));
    double imc = peso / (altura*altura);
    resultadoIMC.setText(String.format("seu IMC é: %.2f",imc));
    }catch (NumberFormatException  ex){
        resultadoIMC.setText(("Por Favor, Coloque valores validos em Altura e Peso"));
    }});


    //layout vertical
    VBox layout = new VBox(10,etiquetaAltura,campoAltura,etiquetaPeso,campoPeso,botaoCalcular,resultadoIMC);
    layout.setPadding(new Insets(10));
    layout.setAlignment(Pos.CENTER);

    Scene scene = new Scene(layout, 300, 350);
    janela.setTitle("calculadora de IMC");
    janela.setScene(scene);
    janela.show();

}

    public static void main(String[] args) {
        launch(args);

    }
}
