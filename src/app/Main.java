package app;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	
	@Override
	public void start(Stage stage) {

		
		try {
			Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/StartView.fxml"));
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.setTitle("Z³ap Chmurê");
			stage.show();
		} catch(Exception e) {

			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
