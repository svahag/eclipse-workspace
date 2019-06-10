package newP;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

public class CipherController {

    public class Controller {

        @FXML
        private TextField nameField;

        @FXML
        private TextField emailField;

        @FXML
        private PasswordField passwordField;

        @FXML
        private Button submitButton;

        @FXML
        protected void handleSubmitButtonAction(ActionEvent event){
            Window owner = submitButton.getScene().getWindow();

        }



    }


}
