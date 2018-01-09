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

public class HighController {

    @FXML
    private Button btn_circ;

    @FXML
    private Button btn_cirs;

    @FXML
    private Button btn_cir;

    @FXML
    private Button btn_return;

    @FXML
    void cirAction(MouseEvent event) throws IOException {
    	
    	Stage stage = new Stage();
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/CirrusView.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Cirrus");
		stage.show();
		
		((Node) (event.getSource())).getScene().getWindow().hide();

    }

    @FXML
    void circAction(MouseEvent event) throws IOException {
    	
    	Stage stage = new Stage();
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/CirrocumulusView.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Cirrocumulus");
		stage.show();
		
		((Node) (event.getSource())).getScene().getWindow().hide();

    }

    @FXML
    void cirsAction(MouseEvent event) throws IOException {
    	
    	Stage stage = new Stage();
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/CirrostratusView.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Cirrostratus");
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

