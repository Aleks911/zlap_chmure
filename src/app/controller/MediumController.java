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

public class MediumController {

    @FXML
    private Button btn_alts;

    @FXML
    private Button btn_altc;

    @FXML
    private Button btn_altcl;

    @FXML
    private Button btn_return;

    @FXML
    void altcAction(MouseEvent event) throws IOException {
    	
    	Stage stage = new Stage();
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/AltocView.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Altocumulus");
		stage.show();
		
		((Node) (event.getSource())).getScene().getWindow().hide(); 

    }

    @FXML
    void altclAction(MouseEvent event) throws IOException {
    	
    	Stage stage = new Stage();
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/AltoclView.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Altocumulus lenticularis");
		stage.show();
		
		((Node) (event.getSource())).getScene().getWindow().hide();

    }

    @FXML
    void altsAction(MouseEvent event) throws IOException {
    	
    	Stage stage = new Stage();
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/AltosView.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Altostratus");
		stage.show();
		
		((Node) (event.getSource())).getScene().getWindow().hide(); 

    }

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

}
