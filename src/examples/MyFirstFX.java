
package examples;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MyFirstFX extends Application {

	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage primStage) throws Exception {
		//wot ill the usah see
		Image gui = new Image("https://i.ytimg.com/vi/TMvzJvK4CUU/hqdefault.jpg");
		ImageView iv = new ImageView(gui);
		//iv.setRotate(45);
		ImageView iv2 = new ImageView(gui);
		//make button
		Button btn = new Button("Curikku senpai");
		Circle nut = new Circle(25);
		nut.setFill(Color.CHOCOLATE);
		nut.setStroke(Color.CHARTREUSE);
		Circle nut2 = new Circle(25);
		nut2.setFill(Color.CHOCOLATE);
		//Create a pane to hold this bit
		HBox hungryBox = new HBox(10);
		VBox nuts = new VBox(10);
		//Create our scene
		Scene s = new Scene(hungryBox);
		nuts.getChildren().addAll(nut,nut2);
		hungryBox.getChildren().addAll(iv,btn,iv2,nuts);
		//set the stage for this scene. I like it.
		primStage.setScene(s);
		primStage.show();
	}

}
