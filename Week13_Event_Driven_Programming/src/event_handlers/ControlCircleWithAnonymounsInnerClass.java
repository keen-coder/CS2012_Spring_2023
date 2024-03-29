package event_handlers;

import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircleWithAnonymounsInnerClass extends Application {
	private CirclePane circlePane = new CirclePane(500, 500);

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Hold two buttons in an HBox
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btEnlarge = new Button("Enlarge");
		Button btShrink = new Button("Shrink");
		
		btEnlarge.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				circlePane.enlarge();	
			}
		});
	
		btShrink.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				circlePane.shrink();
			}
		});
		
		hBox.getChildren().add(btEnlarge);
		hBox.getChildren().add(btShrink);

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circlePane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);

		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 500, 500);
		primaryStage.setTitle("ControlCircle"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	

	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
