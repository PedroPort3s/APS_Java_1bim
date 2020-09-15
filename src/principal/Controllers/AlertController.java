package principal.Controllers;


import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;


public class AlertController {

    @FXML
    private Button btnAlerta;

    @FXML
    void btnAlerta_Action(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	
    	alert.setTitle("Olha s�");
    	alert.setHeaderText("Tudo bom?");
    	alert.setContentText("Um texto legal, pregui�a de copiar Lorem Ipsum");
    	
    	Optional<ButtonType> resultado = alert.showAndWait();
    	
    	alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Retorno");
    	alert.setHeaderText("Voc� pressionou o bot�o:");    	
    	alert.setContentText(String.format("%s",resultado.get().getText()));
    	
    	alert.showAndWait();
    }

}
