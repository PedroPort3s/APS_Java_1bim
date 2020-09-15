package principal.Controllers;

import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Alert.AlertType;

public class ChoiceDialogController {

    @FXML
    private Button btnChoiceDialog;

    @FXML
    void btnChoiceDialog_Action(ActionEvent event) {
    	ChoiceDialog<String> dialogo = new ChoiceDialog<>("","C#","JAVA","C");
    	dialogo.setTitle("Choice Dialog Bacana");
    	dialogo.setHeaderText("Olá");
    	dialogo.setContentText("Escolha uma linguagem");
    	
    	Optional<String> resultado = dialogo.showAndWait();
    	
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Retorno");
    	alert.setHeaderText("Escolheu a linguagem:");    	
    	alert.setContentText(String.format("%s",resultado.get().toString() == "" ? "Nehuma opção foi escolhida" : resultado.get().toString()));
    	
    	alert.showAndWait();
    }

}
