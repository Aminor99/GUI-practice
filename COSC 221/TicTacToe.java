//Name: Asia Minor
//Date: 2-14-19
//Purpose: A programming challenge at the end of chapter 15. simulation of a tic tac toe game

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TicTacToe extends Application {
   public void start (Stage stage) throws Exception {
      Parent parent = FXMLLoader.load(getClass().getResource("TicTacToe.fxml"));
      Scene scene = new Scene(parent);
      stage.setTitle("Tic Tac Toe!");
      stage.setScene(scene);
      stage.show();
   }
   public static void main(String [] args){
      launch(args);
   }
}