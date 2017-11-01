package examples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DoingEvents extends Application {

	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage primStage) throws Exception {
		HBox hb = new HBox(10);
		Button btnEx = new Button("Click me");
		Button btnEx2 = new Button("Click me");
		Button btnEx3 = new Button("Click me");
		Label mug = new Label("This just displays stuff");
		Image img = new Image("https://i.ytimg.com/vi/TMvzJvK4CUU/hqdefault.jpg");
		ImageView iv = new ImageView(img);
		hb.getChildren().addAll(iv,mug,btnEx,btnEx2,btnEx3);
		Scene sc1 = new Scene(hb);
		primStage.setScene(sc1);
		primStage.show();
		
		
		//handling events
		btnEx.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				Button btn = (Button)e.getSource();
				btn.setText("REEEE");
				HBox hub = (HBox)btn.getParent();
				hub.setScaleY(900);
			}
		}
		//literally putting the whole new event handler inside of the place it's used
		);
		btnEx2.setOnAction(new ChangeTextEventHandler());
		btnEx3.setOnAction(new ChangeTextEventHandler());
		iv.setOnMouseClicked(new SimpleFlipEventHandler());
		
		
	}

}
