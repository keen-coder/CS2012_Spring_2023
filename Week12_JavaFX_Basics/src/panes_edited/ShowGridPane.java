package panes_edited;


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowGridPane extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    GridPane pane = new GridPane();
    pane.setAlignment(Pos.CENTER);
    pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    pane.setHgap(10);
    pane.setVgap(10);
   
    // Place nodes in the pane
    //Indexes are (col, row) NOT (row, col).
    //pane_name.add(node, col_index, row_index);
    pane.add(new Label("First Name:"), 0, 0);
    pane.add(new TextField(), 1, 0);
    pane.add(new Label("MI:"), 0, 1); 
    pane.add(new TextField(), 1, 1);
    pane.add(new Label("Last Name:"), 0, 2);
    pane.add(new TextField(), 1, 2);
    Button btAdd = new Button("Add Name");
    pane.add(btAdd, 1, 3);
    GridPane.setHalignment(btAdd, HPos.RIGHT);
    
//    pane.add(new Label("First Name:"), 0, 0);
//    pane.add(new TextField(), 0, 1);
//    pane.add(new Label("MI:"), 1, 0); 
//    pane.add(new TextField(), 1, 1);
//    pane.add(new Label("Last Name:"), 2, 0);
//    pane.add(new TextField(), 2, 1);
//    Button btAdd = new Button("Add Name");
//    pane.add(btAdd, 3, 1);
//    GridPane.setHalignment(btAdd, HPos.RIGHT);
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    //primaryStage.setResizable(false);
    primaryStage.setTitle("ShowGridPane"); // Set the stage title
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