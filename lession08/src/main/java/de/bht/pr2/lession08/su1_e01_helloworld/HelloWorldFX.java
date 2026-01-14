package de.bht.pr2.lession08.su1_e01_helloworld;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Hello World Beispiel für JavaFX.
 * Demonstriert die grundlegende Struktur einer JavaFX-Anwendung.
 */
public class HelloWorldFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Label erstellen
        Label label = new Label("Hallo, JavaFX!");

        // Button erstellen
        Button button = new Button("Klick mich!");
        button.setOnAction(e -> label.setText("Button wurde geklickt!"));

        // Layout-Container erstellen
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(label, button);

        // Scene erstellen
        Scene scene = new Scene(root, 300, 200);

        // Stage konfigurieren
        primaryStage.setTitle("Hello World - JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
