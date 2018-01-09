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

public class StartController {

    @FXML
    private Button btn_atlas;

    @FXML
    private Button btn_historia;

    @FXML
    private Button btn_exit;

    @FXML
    void atlasAction(MouseEvent event) {
    	
    	Stage atlasStage = new Stage();
    	
    	try {
			Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/CloudView.fxml"));
			Scene scene = new Scene(parent);
			atlasStage.setScene(scene);
			atlasStage.setTitle("Atlas");
			atlasStage.show();
		} catch(Exception e) {

			e.printStackTrace();
			
		}
    	
    	((Node) (event.getSource())).getScene().getWindow().hide(); 
	}

    

    @FXML
    void exitAction(MouseEvent event) {
    	
    	Stage stage = (Stage) btn_exit.getScene().getWindow();
        
        stage.close();

    }

    @FXML
    void historiaAction(MouseEvent event) throws IOException {
    	
    	Stage stage = new Stage();
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/DiaryView.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Dziennik zjawisk");
		stage.show();
		
		((Node) (event.getSource())).getScene().getWindow().hide(); 

    }

}
