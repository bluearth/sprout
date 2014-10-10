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
 
 		// Required to bridge any library using java.util.logging to SLF4J
		SLF4JBridgeHandler.removeHandlersForRootLogger();  // (since SLF4J 1.6.5)
		SLF4JBridgeHandler.install();		
		
		launch(args);
	}

}
