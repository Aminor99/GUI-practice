//Name: Asia Minor
//Date: 2-13-19
//Purpose: codelisting 15-9, writing the controller class for a gui that uses a check box but not using a button

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class checkBoxOfLovin extends Application {
   public void start(Stage stage) throws Exception {
      //loads the fxml file
      Parent parent = FXMLLoader.load(getClass().getResource("checkBoxOfLovin.fxml"));
      //build the scene graph
      Scene scene = new Scene(parent);
      //display the window using the scene graph
      stage.setTitle("Check Box ;)");
      stage.setScene(scene);
      stage.show();
   }
   public static void main(String[] args){
      //launches the gui
      launch(args);
   }
}