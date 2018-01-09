package app.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class CirrostratusController {

    @FXML
    private Button btn_return;

    @FXML
    void returnAction(MouseEvent event) throws IOException {
    	
    	Stage stage = new Stage();
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/HighView.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Piêtro wysokie");
		stage.show();
		
		((Node) (event.getSource())).getScene().getWindow().hide();

    }

}
