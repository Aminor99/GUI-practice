//Name: Asia Minor
//Date: 2-13-19
//Purpose: the controller class for the fave food question gui, similar 
//to code listing 15-6 but changed just about everything lol

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class FaveFoodQuestionController {
   @FXML
   private Label outputPersonality;
   @FXML
   private ToggleGroup FaveFoodToggle;
   @FXML
   private RadioButton spicyButton;
    @FXML
   private RadioButton sourButton;
    @FXML
   private RadioButton newButton;
    @FXML
   private RadioButton sweetButton;
    @FXML
   private RadioButton savoryButton;
    @FXML
   private RadioButton fruitsVeggiesButton;
   
   //event listener for spicyButton
   public void spicyListener(){
      if(spicyButton.isSelected()){
         outputPersonality.setText("You like to live life on the edge!");
      }
   }
   //event listener for sour button
   public void sourListener(){
      if(sourButton.isSelected()){
         outputPersonality.setText("You might be restless or anxious! :(");
      }
   }
   //event listener for new button
   public void newListener(){
      if(newButton.isSelected()){
         outputPersonality.setText("You enjoy takings risks!");
      }
   }
   //event listener for sweet button
   public void sweetListener(){
      if(sweetButton.isSelected()){
        outputPersonality.setText("You're a carefree and outgoing person!");
      }
   }
   //event listener for savory button
   public void savoryListener(){
      if(savoryButton.isSelected()){
         outputPersonality.setText("You prefer an uncomplicated and \nsimple life!");
      }
   }
   //event listener for the fruits and veggies button
   public void fruiAndVeggiesListener(){
      if(fruitsVeggiesButton.isSelected()){
         outputPersonality.setText("You're conscientious!");
      }
   } 
}