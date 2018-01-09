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

public class LowController {

    @FXML
    private Button btn_str;

    @FXML
    private Button btn_strc;

    @FXML
    private Button btn_return;

    @FXML
    void returnAction(MouseEvent event) throws IOException {
    	
    	Stage stage = new Stage();
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/CloudView.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Atlas Chmur");
		stage.show();
		
		((Node) (event.getSource())).getScene().getWindow().hide(); 

    }

    @FXML
    void strAction(MouseEvent event) throws IOException {
    	
    	Stage stage = new Stage();
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/StratusView.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Stratus");
		stage.show();
		
		((Node) (event.getSource())).getScene().getWindow().hide(); 

    }

    @FXML
    void strcAction(MouseEvent event) throws IOException {
    	
    	Stage stage = new Stage();
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/StratocumulusView.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Stratocumulus");
		stage.show();
		
		((Node) (event.getSource())).getScene().getWindow().hide(); 

    }

}
