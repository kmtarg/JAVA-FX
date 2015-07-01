package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			final String nazwa = "KOnwersja od ty³u i anagolicznie w drug¹ strone";
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
