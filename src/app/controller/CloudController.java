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

public class CloudController {

    @FXML
    private Button btn_niskie;

    @FXML
    private Button btn_srednie;

    @FXML
    private Button btn_wysokie;

    @FXML
    private Button btn_return;

    @FXML
    void niskieAction(MouseEvent event) throws IOException {
    	
    	Stage stage = new Stage();
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/LowView.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Piêtro niskie");
		stage.show();
		
		((Node) (event.getSource())).getScene().getWindow().hide(); 
		

    }
    

    @FXML
    void returnAction(MouseEvent event) throws IOException {
    	
    	Stage stage = new Stage();
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/StartView.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Z³ap Chmurê");
		stage.show();
		
		((Node) (event.getSource())).getScene().getWindow().hide(); 

    }

    @FXML
    void srednieAction(MouseEvent event) throws IOException {

    	Stage stage = new Stage();
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/MediumView.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Piêtro œrednie");
		stage.show();
		
		((Node) (event.getSource())).getScene().getWindow().hide(); 
    	
    }

    @FXML
    void wysokieAction(MouseEvent event) throws IOException {
    	
    	Stage stage = new Stage();
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/HighView.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Piêtro wysokie");
		stage.show();
		
		((Node) (event.getSource())).getScene().getWindow().hide(); 

    }

}
