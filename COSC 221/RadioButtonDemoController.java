//Name: Asia Minor
//Date: 2-13-19
//Purpose: Code Listing 15-4, the controller class for the radio button demo

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class RadioButtonDemoController {
	@FXML
	private RadioButton carnivoreRadioButton;
	@FXML
	private RadioButton veganRadioButton;
	@FXML
	private RadioButton vegetarianRadioButton;
	@FXML
	private ToggleGroup ToggleGroupForCodeListing;
	@FXML
	private Label outputLabel;
	@FXML
	private Button showChoiceButton;
	//event listen for the showChoiceButton component
	public void showChoiceListener() {
		if(veganRadioButton.isSelected()) {
			outputLabel.setText("Vegan");
		}
		if(vegetarianRadioButton.isSelected()) {
			outputLabel.setText("AWESOME");
		}
		if(carnivoreRadioButton.isSelected()) {
			outputLabel.setText("Carnivore");
		}
	}
}