//first test edit -Trent





import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import javafx.scene.*;
import javafx.scene.paint.Color;


public class hello_world extends Application {

	public static void main(String[] args) {
		launch(args);

	}
	
	/*
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("hello world");
		Button btn = new Button();
		btn.setText("say 'hello world'");;
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event){
				System.out.println("hello world");
			}
		}
		);
		
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
	}
	*/
	
	
	
	
	
	/*
	@Override
		public void start(Stage primaryStage){
			primaryStage.setTitle("JavaFX Welcome");
			
			
			
			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25, 25, 25 ,25));
			
			
			
			Text scenetitle = new Text("Welcome");
			scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			grid.add(scenetitle, 0, 0, 2, 1);
			
			Label userName = new Label("User Name:");
			grid.add(userName, 0, 1);
			
			TextField userTextField = new TextField();
			grid.add(userTextField,  1,  1);
			
			Label pw = new Label("Password:");
			grid.add(pw,  0,  2);
			
			PasswordField pwBox = new PasswordField();
			grid.add(pwBox, 1, 2);
			
			
			Button btn = new Button("Sign in");
			HBox hbBtn = new HBox(10);
			hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
			hbBtn.getChildren().add(btn);
			grid.add(hbBtn, 1, 4);
			
			
			final Text actiontarget = new Text();
			grid.add(actiontarget, 1, 6);
			
			
			
			
			
			
			Scene scene = new Scene(grid, 300, 275);
			primaryStage.setScene(scene);
			
			
			primaryStage.show();
		}
	*/
	
	
	
	
	@Override
	public void start(Stage primaryStage){
		Group root = new Group();
		Scene scene = new Scene(root, 800, 600, Color.BLACK);
		primaryStage.setScene(scene);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		primaryStage.show();
		
	}
	
	
	
	
	

}
