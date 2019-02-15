//Name: Asia Minor
//Date: 2-13-19
//Purpose: code listing 15-11, demo for the image viewer. i used my own images, i dont know how thats gonna work for you

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PiplupImageView extends Application {
   public void start (Stage stage) throws Exception {
      //loads the file
		Parent parent = FXMLLoader.load(getClass().getResource("PiplupImageView.fxml"));
      //builds the scene graph
      Scene scene = new Scene(parent);
      //display the window using the scene graph
      stage.setTitle("Choose a piplup!");
      stage.setScene(scene);
      stage.show();
   }
   public static void main(String[] args) {
      //launches the gui
      launch(args);
   }
}