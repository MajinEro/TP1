package sample.unilim.info.ihm.tp1.exo1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import  javafx.scene.control.Button;

public class TestJavaFX extends Application {

    public void start(Stage primaryStage){
        final StackPane root = new StackPane();
        final Button boutonValider = new Button();
        boutonValider.setText("Valider");
        root.getChildren().add(boutonValider);
        Scene scene = new Scene(root,600 ,600);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("TP1");

    }


    public static void main(String[] args){
        Application.launch();
    }

}
