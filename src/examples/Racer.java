package examples;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.animation.PathTransition.OrientationType;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Racer extends Application {

	public static void main(String[] args) {
		launch();

	}
	public void start(Stage primStage) throws Exception {
		ImageView car = new ImageView(new Image("http://data.3dtuning.com/tun/QXVTan5aubL.jpg"));
		car.setFitHeight(60);
		car.setFitWidth(150);
		Rectangle rectPath = new Rectangle(100,100,400,100);
		Path path = new Path();
		PathTransition patTrans = new PathTransition();
		//set it all up
		patTrans.setPath(rectPath);
		patTrans.setNode(car);
		patTrans.setDuration(Duration.millis(1500));
		//set orientation
		patTrans.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);
		//number of loops
		patTrans.setCycleCount(Timeline.INDEFINITE);
		//Create a track for the car
		Rectangle track = new Rectangle(125,115,350,70);
		track.setFill(Color.TRANSPARENT);
		track.setStroke(Color.BLACK);
		Rectangle track2 = new Rectangle(75,75,460,150);
		track2.setFill(Color.TRANSPARENT);
		track2.setStroke(Color.BLACK);
		
		//now we make a pane
		Pane pane = new Pane();
		pane.setMinHeight(310);
		pane.setMinWidth(600);
		pane.getChildren().addAll(car,track,track2);
		Scene wumbo = new Scene(pane);
		primStage.setScene(wumbo);
		primStage.show();
		
		//actually start the animation
		patTrans.play();
	}


}
