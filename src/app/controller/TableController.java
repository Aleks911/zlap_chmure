package app.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import app.database.DBconnector;
import app.model.Dziennik;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class TableController {

    @FXML
    private TableView<Dziennik> t;

    @FXML
    private TableColumn<Dziennik, Integer> t_id;

    @FXML
    private TableColumn<Dziennik, String> t_nazwa;

    @FXML
    private TableColumn<Dziennik, String> t_poczatek;

    @FXML
    private TableColumn<Dziennik, String> t_koniec;

    @FXML
    private TableColumn<Dziennik, String> t_deszcz;

    @FXML
    private TableColumn<Dziennik, String> t_grad;

    @FXML
    private TableColumn<Dziennik, String> t_wyladowania;

    @FXML
    private TableColumn<Dziennik, Integer> t_predkosc_wiatru;

    @FXML
    private TableColumn<Dziennik, Integer> t_intensywnosc;

    @FXML
    private Button btn_delete;

    @FXML
    private Button btn_return;
    
    DBconnector db = new DBconnector();
	Connection conn = db.connInit();
    
    public ObservableList<Dziennik> dane = FXCollections.observableArrayList();
    
    PreparedStatement ps;
    int id_selected;
    
    private void connection() {
 		db = new DBconnector();
 		conn = db.connInit();
     }

    @FXML
    void deleteAction(MouseEvent event) {
    	
    	try {
	    	id_selected = t.getSelectionModel().getSelectedItem().getId(); 
	    	}
	    	catch (Exception e) {
	    		Alert a = new Alert(AlertType.ERROR);
	        	a.setTitle("B³¹d");
	        	a.setHeaderText("B³¹d");
	        	a.setContentText("Aby usun¹æ rekord musisz go najpierw zaznaczyæ");
	        	a.showAndWait();
	    	}
	    	
	    	connection();
	    	try {
	    	ps = conn.prepareStatement("DELETE FROM zjawiska WHERE id=?");
	    	ps.setInt(1, id_selected);
	    	ps.executeUpdate();
	    	}
	    	catch (SQLException e) {
	    		e.printStackTrace();
	    	}
	    	select();

}

    

    @FXML
    void returnAction(MouseEvent event) throws IOException {
    	
    	Stage stage = new Stage();
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/DiaryView.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Dziennik zjawisk");
		stage.show();
		
		((Node) (event.getSource())).getScene().getWindow().hide(); 

    }
    
    private void select() {
    	dane.clear();
		t.setItems(dane);
    	try {
    		PreparedStatement ps = conn.prepareStatement("select * from zjawiska");
    		ResultSet rs = ps.executeQuery();
			
    		while(rs.next()) {
    			dane.add(new Dziennik(
    					rs.getInt("id"),
    					rs.getString("nazwa"),
    					rs.getString("poczatek"),
    					rs.getString("koniec"),
    					rs.getString("deszcz"),
    					rs.getString("grad"),
    					rs.getString("wyladowania"),
    					rs.getInt("predkosc_wiatru"),
    					rs.getInt("intensywnosc")  					
    					));
    		}
    		
    		t_id.setCellValueFactory(new PropertyValueFactory<Dziennik, Integer>("id"));
    		t_nazwa.setCellValueFactory(new PropertyValueFactory<Dziennik, String>("nazwa"));
    		t_poczatek.setCellValueFactory(new PropertyValueFactory<Dziennik, String>("poczatek"));
    		t_koniec.setCellValueFactory(new PropertyValueFactory<Dziennik, String>("koniec"));
    		t_deszcz.setCellValueFactory(new PropertyValueFactory<Dziennik, String>("deszcz"));
    		t_grad.setCellValueFactory(new PropertyValueFactory<Dziennik, String>("grad"));
    		t_wyladowania.setCellValueFactory(new PropertyValueFactory<Dziennik, String>("wyladowania"));
    		t_predkosc_wiatru.setCellValueFactory(new PropertyValueFactory<Dziennik, Integer>("predkosc_wiatru"));
    		t_intensywnosc.setCellValueFactory(new PropertyValueFactory<Dziennik, Integer>("intensywnosc"));
    		
    		//dodanie danych do TabelView w postaci obiektu ObservableList
    		t.setItems(dane);
    		
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    public void initialize() {
    	select();
    }

}

