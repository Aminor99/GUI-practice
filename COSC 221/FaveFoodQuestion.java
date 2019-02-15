//Name: Asia Minor
//Date: 2-13-19
//Purpose: This is similar to code listing 15-5 but I changed the options and stuff, same concept though

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FaveFoodQuestion extends Application {
   public void start(Stage stage) throws Exception{
      //loads the FXML file
      Parent parent = FXMLLoader.load(getClass().getResource("FaveFoodQuestion.fxml"));
      //build the scene graph
      Scene scene = new Scene(parent);
      //display our window using the scene graph
      stage.setTitle("Fave Food?");
      stage.setScene(scene);
      stage.show();
   }
   public static void main(String[] args){
      //launch the application
      launch(args);
   }
}