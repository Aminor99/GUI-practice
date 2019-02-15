//Name: Asia Minor
//Date: 2-12-19
//Purpose: Code Listing 15-2, making the controller class for the kilometer converter

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class KilometerConverterController {
   @FXML // an annotaion that must precede nonpublic field declarations or field definitions used by the FXML file
   private Button convertButton; //a button component was used in the GUI, and convertButton was the fx:id we gave to it
   @FXML
   private TextField kilometertextField; //kilometertextField is the fx:id of the TextField
   @FXML
   private Label outputLabel;
   @FXML
   private Label promptLabel; 
//There was an optional code called initialize? it initializes some code after the FXML file loaded  
   //event listener
   public void converButtonListeter(){ //makes the button component able to be interacted with
      final double conversionFactor = .6214;
      //this gets the kilometers from the text field
      String str = kilometertextField.getText(); //anything written in the textfield is a string and must be converted
      //so we're gonna convert it :)
      double miles = Double.parseDouble(str) * conversionFactor;
      //this displays the conversion in the label we called outputlabel
      outputLabel.setText(str + " kilometers is " + miles + " miles."); //look a setter method :O
   }
}