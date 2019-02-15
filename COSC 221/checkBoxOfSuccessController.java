//Name: Asia Minor
//Date: 2-13-19
//Purpose: code listing 15-8, the controller class for the check box demo

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;

public class checkBoxOfSuccessController {
   @FXML
   private CheckBox checkBox;
   @FXML
   private Label outputLabel;
   @FXML
   private Button okButton;
   
   //event listener for the ok button component
   public void okButtonListener(){ 
      if(checkBox.isSelected()){
         outputLabel.setText("Yeah! Go 'head and succed! :)");
      } else {
         outputLabel.setText("Why wouldn't you wanna \nsucceed? :/");
      }
   }
}