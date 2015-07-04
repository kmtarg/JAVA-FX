package controllers;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ControllerButtonLayout implements Initializable {

    @FXML
    private Button small;

    @FXML
    private Button big;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		System.out.println("Button layer controller start");
		
	}

	public Button getSmall() {
		return small;
	}

	public void setSmall(Button small) {
		this.small = small;
	}

	public Button getBig() {
		return big;
	}

	public void setBig(Button big) {
		this.big = big;
	}

}
