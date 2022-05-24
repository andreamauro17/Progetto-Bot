package application;
	
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			HBox root = new HBox();
			Button b1 = new Button("Lancia Bot Telegram");
			Button b2 = new Button("Termina comuinicazione");
			b1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
				public void handle(MouseEvent arg0) {
					Telegram.run();
				}
			});
			
			b2.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
				public void handle(MouseEvent arg0) {
					Telegram.end();
				}
			});
			root.getChildren().addAll(b1,b2);
			Scene scene = new Scene(root,800,800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Progetto NABOO");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
