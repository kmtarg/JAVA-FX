package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;


public class LowerCaseController implements Initializable {

	@FXML
	private Button Button;

	@FXML
	private TextArea Text;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// x ->  Wyra¿enie lambda java 8 
		//Button.setOnAction(x -> Text.setText(Text.getText().toLowerCase()));
		
		   Button.addEventFilter(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
		        @Override
		        public void handle(MouseEvent event) {
		            System.out.println("Wjazd na przycisk");
		        }
		    });
		   Button.addEventFilter(MouseEvent.MOUSE_MOVED, x -> System.out.println(" przejazd wyszk¹ nad przyciskiem "));

		Button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				String PrzykladowText = Text.getText();
				String temp = "";
				// PrzykladowText.toLowerCase();

				Text.setText(PrzykladowText.toLowerCase());
				// System.out.println("source "+event.getSource());
				// System.out.println("  event type " + event.getEventType());
				StringBuilder sb = new StringBuilder();
				sb.append(temp);

				sb.append(PrzykladowText.toLowerCase());

				sb.append("\n\n");

				sb.append("source ");

				sb.append(event.getSource());
				sb.append("\n\n");
				sb.append("event ");
				sb.append(event.getEventType());

				Text.setText(sb.toString());

			}
		});
		

	}

}
