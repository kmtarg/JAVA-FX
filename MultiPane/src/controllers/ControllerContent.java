package controllers;



import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


public class ControllerContent implements Initializable  {
	
	
	@FXML
	private ControllerButtonLayout ButtonLController;  // nazwa taka jak  ID: w fmxml
	@FXML
	private ControllerTextLayout TextLController;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		System.out.println(ButtonLController);
		System.out.println(TextLController);
		
		Button small = ButtonLController.getSmall();
		Button big = ButtonLController.getBig();
		TextArea text = TextLController.getText();
		
		small.setOnAction(x -> text.setText(text.getText().toLowerCase()));
		big.setOnAction(x -> text.setText(text.getText().toUpperCase()));
		
	}

}
