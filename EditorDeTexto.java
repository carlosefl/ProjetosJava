package com.example.javafxdemo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import java.io.File;
import java.io.PrintWriter;
import javafx.scene.control.ToolBar;

public class EditorDeTexto extends Application {
    @Override
    public void start(Stage janela){

        TextArea campoDeTexto = new TextArea();
        Button salvar = new Button("salvar");
        ToolBar barraFerramentas = new ToolBar(salvar);
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(campoDeTexto);
        borderPane.setTop(barraFerramentas);


        Scene scene = new Scene(borderPane, 800,800);

        janela.setScene(scene);
        janela.setTitle("Editor de Texto");
        janela.show();
        salvar.setOnAction(e -> salvarTexto(campoDeTexto));
    }

    private void salvarTexto(TextArea text){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("salvar aquivo de Texto");
        File file = fileChooser.showSaveDialog(null);

        if (file != null){

            try(PrintWriter writer = new PrintWriter(file)) {

                writer.println(text.getText());

            }catch (Exception e){
                System.out.println("ocorreu um problema: "+ e.getMessage());
            }
        }




    }
    public static void main(String[] args) {
        launch(args);
    }
}
