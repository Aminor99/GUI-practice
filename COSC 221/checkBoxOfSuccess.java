//Name: Asia Minor
//Date: 2-13-19
//Purpose: Code listing 15-7, i changed a little bit of stuff. this is practice for checkboxes

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class checkBoxOfSuccess extends Application {
   public void start(Stage stage) throws Exception {
      //loads the fxml file
      Parent parent = FXMLLoader.load(getClass().getResource("checkBoxOfSuccess.fxml"));
      //builds the scene graph
      Scene scene = new Scene(parent);
      //display the window using the scene graph
      stage.setTitle("Check to Succeed!");
      stage.setScene(scene);
      stage.show();
   }
   public static void main(String[] args){
      //launch the application
      launch(args);
   }
}