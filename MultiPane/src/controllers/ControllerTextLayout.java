package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class ControllerTextLayout implements Initializable{

    @FXML
    private TextArea text;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		System.out.println("text controller");
		
	}

	public TextArea getText() {
		return text;
	}

	public void setText(TextArea text) {
		this.text = text;
	}

}
