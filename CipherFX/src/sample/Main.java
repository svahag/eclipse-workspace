package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{


        GridPane rootPane = new GridPane();
        rootPane.setHgap(10);rootPane.setVgap(10);



        Scene scene = new Scene(rootPane, 400, 400);
        stage.setTitle("New Title");
        stage.setScene(scene);
        stage.show();


        Button b1 = new Button("button1");
        b1.setPrefSize(80,20);

        Text t1 = new Text("yoooooo");
        t1.setFont(Font.font(18));
        Text t2 = new Text("");
        t2.setFont(Font.font(18));

        rootPane.getChildren().addAll(t1, b1);
        GridPane.setConstraints(t1, 0,0);
        GridPane.setConstraints(b1, 0,1);
        rootPane.getChildren().add(t2);



        ToggleGroup tg = new ToggleGroup();
        RadioButton rb1 = new RadioButton("Caeser Cipher");
        rb1.setToggleGroup(tg);
        rb1.setSelected(true);
        RadioButton rb2 = new RadioButton("Vigenere Cipher");
        rb2.setToggleGroup(tg);

        rootPane.getChildren().addAll(rb1, rb2);
        GridPane.setConstraints(rb1, 0, 3);
        GridPane.setConstraints(rb2, 0, 4);

        b1.setOnAction(event -> {
            t2.setText("you did it!");
            GridPane.setConstraints(t2, 1, 1);
            if(rb1.isSelected()){
                System.out.print("rb1");
            }
            else if(rb2.isSelected()){
                System.out.println("rb2");
            }
        });






        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));



    }



}
