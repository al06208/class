package examples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class MyRide extends Application{
	public static void main(String[] args) {
		launch();
	}
	public void start(Stage primaryStage) throws Exception {
		Circle c1 = new Circle(20.0);
		c1.setCenterY(120);
		c1.setCenterX(270);
		Circle c2 = new Circle(20.0);
		c2.setCenterX(330);
		c2.setCenterY(120);
		Rectangle r1 = new Rectangle(70.0, 20.0);
		r1.setLayoutX(265);
		r1.setLayoutY(60);
		r1.setStroke(Color.BLACK);
		r1.setFill(Color.LIGHTSKYBLUE);
		Rectangle r2 = new Rectangle(120.0,40.0);
		r2.setLayoutX(240);
		r2.setLayoutY(80);
		r2.setStroke(Color.BLACK);
		r2.setFill(Color.RED);
		Pane mane = new Pane();
		mane.getChildren().addAll(c1,c2,r1,r2);
		Scene s = new Scene(mane, 600, 600);
		primaryStage.setScene(s);
		primaryStage.show();
	}

}
