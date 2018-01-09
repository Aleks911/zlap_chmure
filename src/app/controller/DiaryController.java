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

public class DiaryController {

    @FXML
    private Button btn_show;

    @FXML
    private Button btn_add;

    @FXML
    private Button btn_return;

    @FXML
    void addAction(MouseEvent event) throws IOException {
    	
    	Stage stage = new Stage();
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/AddView.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Dodaj zjawisko");
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
    void showAction(MouseEvent event) throws IOException {
    	
    	Stage stage = new Stage();
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/TableView.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Historia");
		stage.show();
		
		((Node) (event.getSource())).getScene().getWindow().hide(); 

    }

}
