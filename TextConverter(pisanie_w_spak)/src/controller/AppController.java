package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class AppController implements Initializable {

	@FXML
	private Button Button;

	@FXML
	private TextArea Text2;

	@FXML
	private TextArea Text1;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// TODO Auto-generated method stub

		Button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Text1.clear();
				Text2.clear();
				// TODO Auto-generated method stub

			}
		});
		// z wykorzytaniem lambda
		Text1.addEventFilter(KeyEvent.KEY_RELEASED, x -> Text2
				.setText(new StringBuilder(Text1.getText()).reverse()
						.toString()));

		// klasycznie
		Text2.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				String in2 = Text2.getText();

				StringBuilder sb = new StringBuilder();

				sb.append(in2);
				sb.reverse();
				Text1.setText(sb.toString());

			}
		});
	}

}
