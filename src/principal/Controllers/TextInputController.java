package principal.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;

public class TextInputController {

    @FXML
    private Button btnTextInputDialog;

    @FXML
    void btnTextInputDialog_Action(ActionEvent event) {
    	TextInputDialog textDialog = new TextInputDialog();
    	textDialog.setTitle("Text Dialog Bacana Também");
    	textDialog.setHeaderText("Olá denovo");
    	textDialog.setContentText("Digita algo ai: ");
    	
    	textDialog.showAndWait();
    }

}
