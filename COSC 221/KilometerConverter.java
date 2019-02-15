//Name: Asia Minor
//Date: 2-11-19
//Purpose: Code Listing 15-1, writing a java file to read the FXML file of the same name
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class KilometerConverter extends Application { //the extends keyword is used to inherit variables and methods from another class
	//the main application class?
	public void start(Stage stage) throws Exception{ //i'm not sure what the exception here is yet
		//this is loading the FXML file
		Parent parent = FXMLLoader.load(getClass().getResource("KilometerConverter.fxml"));
		//builds the scene graph
		Scene scene = new Scene(parent);
		//displays the window using the scene graph
		stage.setTitle("Kilometer Converter");
		stage.setScene(scene);
		stage.show();
	}
	//MAIN METHOD
	public static void main (String [] args) {
		//launches the application
		launch(args);
	}
}
