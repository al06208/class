package examples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class MyMediaPlayer extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();

	}
	public void start(Stage primStage) {
		Media media = new Media("http://download.oracle.com/otndocs/products/javafx/oow2010-2.flv");
		MediaPlayer mp = new MediaPlayer(media);
		MediaView mv = new MediaView(mp);
		mv.setX(50);
		mv.setY(50);
		mv.setFitHeight(300);
		mv.setFitWidth(200);
		
		mp.setAutoPlay(true);
		Button pause = new Button("pause");
		pause.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				mp.pause();
				
			}
			
		});
		Button play = new Button();
		play.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				mp.play();
				
			}
			
		});
		pause.setLayoutX(50);
		pause.setLayoutY(360);
		play.setLayoutX(150);
		play.setLayoutY(360);
		Pane nut = new Pane();
		nut.getChildren().addAll(mv,play,pause);
		Scene scene = new Scene(nut, 400, 300);
		primStage.setScene(scene);
		primStage.show();
		
	}

}
