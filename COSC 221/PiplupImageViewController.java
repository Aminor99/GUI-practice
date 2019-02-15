//Name: Asia Minor
//Date: 2-13-19
//Purpose: code listing 15-12, controller class for the imagve view gui

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class PiplupImageViewController {
   @FXML                             //private fields for components
   private ImageView piplupImage;
   @FXML
   private ToggleGroup piplupToggleGroup;
   @FXML
   private RadioButton piplupButton1;
   @FXML
   private RadioButton piplupButton2;
   
   private Image piplupImage1;        //private image declarations
   private Image piplupImage2;
   
   public void initialize() {          //initialize method
      //loads the images of boths piplups
      piplupImage1 = new Image("I LOVE HIM.png");
      piplupImage2 = new Image("BABY.png");
   }
   //event listener for button1
   public void piplup1ButtonListener() {
      if(piplupButton1.isSelected()) {
         piplupImage.setImage(piplupImage1);
      }
   }
   //event listener for button2
   public void piplup2ButtonListener() {
      if(piplupButton2.isSelected()) {
         piplupImage.setImage(piplupImage2);
      }
   }
}
