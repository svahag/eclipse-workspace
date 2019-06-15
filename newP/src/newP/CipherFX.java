package newP;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class CipherFX extends Application {


    Scene scene1, scene2;



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        Stage window = primaryStage;


        Label label1 = new Label ("Welocome to the first scene");
        Button button1 = new Button("go to scene 2");
        button1.setOnAction(event -> window.setScene(scene2));

        VBox vbox = new VBox(20);
        vbox.getChildren().addAll(label1, button1);
        Scene scene1 = new Scene(vbox, 200, 200);











        /*Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Registration Form FXML Application");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
        */

    }
}
