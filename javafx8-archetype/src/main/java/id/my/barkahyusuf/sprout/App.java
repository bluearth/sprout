package id.my.barkahyusuf.sprout;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Scene mainScene = FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"));
		stage.setMaximized(true);
		stage.setScene(mainScene);

		stage.show();		
	}

	public static void main(String ... args) {
		launch(args);
	}

}
