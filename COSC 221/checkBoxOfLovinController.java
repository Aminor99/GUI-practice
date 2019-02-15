//Name: Asia Minor
//Date: 2-13-19
//Purpose: code listing 15-10, controller class for the check box without a button

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;

public class checkBoxOfLovinController {
   @FXML
   private CheckBox checkBox;
   @FXML
   private Label outputLabel;
   
   //event listener for the checkbox
   public void checkBoxListener(){
      if(checkBox.isSelected()){
         outputLabel.setText("As we all should :)");
      } else {
         outputLabel.setText("How dare you be so \nheartless??");
      }
   }  
}