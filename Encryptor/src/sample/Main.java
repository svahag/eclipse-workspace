package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("gui1.fxml"));
        Scene scene = new Scene(root, 800,600);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);







        /*
        Label headline = new Label("ENCRYPT YOUR TEXT");
        headline.setFont(Font.font("aerial", 40));
        rootpane.getChildren().add(headline);
        GridPane.setConstraints(headline, 0,0, 4, 1, HPos.CENTER, VPos.CENTER);

        TextArea ta1 = new TextArea("Input your text here");
        rootpane.getChildren().add(ta1);
        GridPane.setConstraints(ta1, 0, 1, 4, 1, HPos.CENTER, VPos.CENTER);


        HBox hb1 = new HBox();
        hb1.setPrefWidth(780);
        rootpane.getChildren().add(hb1);
        GridPane.setConstraints(hb1, 0, 3, 4, 1);


        ToggleGroup tg = new ToggleGroup();
        RadioButton rbcaeser = new RadioButton("Caeser Cipher");
        rbcaeser.setFont(Font.font("aerial", 16));
        rbcaeser.setToggleGroup(tg);
        rbcaeser.setSelected(true);
        RadioButton rbvigenere = new RadioButton("Vigenere Cipher");
        rbvigenere.setToggleGroup(tg);
        rbvigenere.setFont(Font.font("aerial", 16));
        rootpane.getChildren().addAll(rbcaeser, rbvigenere);
        GridPane.setConstraints(rbcaeser, 0,3);
        GridPane.setConstraints(rbvigenere, 0, 4);

        HBox hb2 = new HBox();
        hb2.setPrefWidth(400);
        rootpane.getChildren().add(hb2);
        GridPane.setConstraints(hb2, 1, 2);

        Label keylabel = new Label("Enter Key:");
        keylabel.setFont(Font.font("aerial", 16));
        rootpane.getChildren().add(keylabel);
        GridPane.setConstraints(keylabel, 2, 3);

        TextField keytf = new TextField();
        rootpane.getChildren().add(keytf);
        GridPane.setConstraints(keytf, 3, 3);
        keytf.setFont(Font.font("aerial", 12));
        keytf.setPrefColumnCount(10);

        TextArea ta2 = new TextArea();
        rootpane.getChildren().add(ta2);
        GridPane.setConstraints(ta2, 0, 5, 4, 1, HPos.CENTER, VPos.CENTER);
        ta2.setEditable(false);

        Button btn = new Button("Submit");
        btn.isDefaultButton();
        rootpane.getChildren().add(btn);
        GridPane.setConstraints(btn, 3, 4);
        btn.setFont(Font.font("aerial", 16));

        btn.setOnAction(e->{
            String txt = ta1.getText();
            String keyString = keytf.getText();

            if(rbcaeser.isSelected()){
                int key = Integer.parseInt(keyString);
                Caeser c1 = new Caeser(txt, key);
                String result = c1.setCipher();
                ta2.setText(result);
            }
            else if(rbvigenere.isSelected()){
                Vigenere v1 = new Vigenere(txt, keyString);
                v1.makeKey();
                String result = v1.setCipher();
                ta2.setText(result);
            }


        });







        */

    }


    public static void main(String[] args) {
        launch(args);
    }
}
