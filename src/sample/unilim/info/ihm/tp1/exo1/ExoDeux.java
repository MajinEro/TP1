package sample.unilim.info.ihm.tp1.exo1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.awt.*;

public class ExoDeux extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();

        Scene scene = new Scene(root ,400, 170);

        creerBouton(root);


        creerLabelHaut(root);


        primaryStage.setScene(scene);
        primaryStage.setTitle("Application login");
        primaryStage.show();
    }

    private void creerLabelHaut(BorderPane root) {
        final Label labelHaut = new Label();
        labelHaut.setText("Veuillez saisir vos informations de login");
        root.setTop(labelHaut);
        labelHaut.setAlignment(Pos.CENTER);

    }

    private void creerBouton(BorderPane root) {
        final Button boutonValider = new Button();
        boutonValider.setText("Valider");
        boutonValider.setMaxSize(80,80);
        root.setRight(boutonValider);
    }
}
