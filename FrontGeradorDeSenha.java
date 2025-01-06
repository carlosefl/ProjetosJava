package com.example.javafxdemo;
import  com.example.javafxdemo.GeradorSenhaSegura;
import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
public class FrontGeradorDeSenha extends Application{
    @Override
    public void start(Stage janela){
       Label tamanho = new Label("Tamanho Da Senha");
       TextField quantidadeSenha = new TextField();
       quantidadeSenha.setPromptText("Digite um Numero");
       Button gerarSenha = new Button("Gerar Senha");
       Label senhaGerada = new Label();
       gerarSenha.setStyle("-fx-text-fill: cyan; -fx-background-color: black;");
       gerarSenha.setOnAction(e -> {int comprimentoSenha = Integer.parseInt(quantidadeSenha.getText());
       String senha = GeradorSenhaSegura.gerarSenha(comprimentoSenha);
       senhaGerada.setText("Senha Gerada: " + senha);});
       VBox layout = new VBox(tamanho,quantidadeSenha,gerarSenha,senhaGerada);
       layout.setSpacing(10);// espaço entre os componentes
       layout.setPadding(new Insets(10));// espaço entre as bordas de 10 pixels
       layout.setAlignment(Pos.CENTER);
       Scene scene = new Scene(layout,300,300);
       janela.setScene(scene);
       janela.setTitle("Gerador De Senha");
       janela.show();}
    public static void main(String[] args) {
    launch(args);}
}