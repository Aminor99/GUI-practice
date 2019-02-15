//Name: Asia Minor
//Date: 2-14-19
//Purpose: controller class for the favorite color GUI

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Label;

public class FavoriteColorController {
   @FXML
   private Label outputLabel;
   @FXML
   private ToggleGroup colorGroup;
   @FXML
   private RadioButton redButton;
   @FXML
   private RadioButton blueButton;
   @FXML
   private RadioButton greenButton;
   @FXML
   private RadioButton yellowButton;
   @FXML
   private RadioButton blackButton;
   @FXML
   private RadioButton pinkButton;
   
   //event listeners
   public void redListener(){
      if(redButton.isSelected()){
         outputLabel.setText("You are very determined!");
      }
   }
   public void blueListener(){
      if(blueButton.isSelected()){
         outputLabel.setText("You are sensitive \nand reliable!");
      }
   }
   public void greenListener(){
      if(greenButton.isSelected()){
         outputLabel.setText("You are loyal!");         
      }
   }
   public void yellowListener(){
      if(yellowButton.isSelected()){
         outputLabel.setText("You enjoy learning!");
      }
   }
   public void blackListener(){
      if(blackButton.isSelected()){
         outputLabel.setText("You're artistic!");
      }
   }
   public void pinkListener(){
      if(pinkButton.isSelected()){
         outputLabel.setText("You're affectionate!");
      }
   }
}