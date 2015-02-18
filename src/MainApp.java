/**
 * An application that allows the user to enter
 * their weight and height in either imperial or
 * metric and then calculates their bmi.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {
    private BorderPane root;
    private Stage stage;
    private Scene scene;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        root = new BorderPane();
        scene = new Scene(root, 400, 600); //width and height of application
        stage.setScene(scene);
        stage.setTitle("Body Mass Index (BMI) Calculator");  //text for the title bar of the window


        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}