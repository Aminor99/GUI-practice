//Name: Asia Minor
//Date: 2-13-19
//Purpose: Code Listing 15-3, the main application class for the radio button demo

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RadioButtonDemo extends Application {
	public void start (Stage stage)throws Exception{
		//loads the FXML file
		Parent parent = FXMLLoader.load(getClass().getResource("RadioButtonDemo.fxml"));
		//build the scene graph
		Scene scene = new Scene(parent);
		//display our window, using the scene graph
		stage.setTitle("RadioButtons");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String [] args) {
		//launch the application
		launch(args);
	}
}