//Name: Asia Minor
//Date: 2-14-19
//Purpose: excercise for the radio buttons

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FavoriteColor extends Application {
   public void start(Stage stage) throws Exception {
      Parent parent = FXMLLoader.load(getClass().getResource("FavoriteColor.fxml"));
      Scene scene = new Scene (parent);
      stage.setTitle("Favorite Color?");
      stage.setScene(scene);
      stage.show();
   }
   public static void main (String[] args){
      launch(args);
   }
}
