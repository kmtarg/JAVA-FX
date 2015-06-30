package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			final String nazwa = "Zmiana wielkoœci";
			 Parent parent = (Parent)FXMLLoader.load(getClass().getResource("/view/MainPane.fxml"));
		        Scene scene = new Scene(parent);
		        primaryStage.setScene(scene);
		        primaryStage.setTitle(nazwa);
		        primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
