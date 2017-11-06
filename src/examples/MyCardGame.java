package examples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyCardGame extends Application {
	//just gonna put this here
	int imgNum = 0;
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage arg0) throws Exception {
		Image[] cards = new Image[4];
		cards[0] = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/01_of_spades_A.svg/1200px-01_of_spades_A.svg.png");
		cards[1] = new Image("https://upload.wikimedia.org/wikipedia/commons/3/38/Poker-sm-241-Ac.png");
		cards[2] = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Playing_card_heart_A.svg/1200px-Playing_card_heart_A.svg.png");
		cards[3] = new Image("https://upload.wikimedia.org/wikipedia/commons/b/be/Poker-sm-231-Ad.png");
		ImageView iv = new ImageView();
		iv.setImage(cards[imgNum]);
		
	//	StackPane sPane = new StackPane();
	//	sPane.getChildren().add(new ImageView(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/01_of_spades_A.svg/1200px-01_of_spades_A.svg.png")));
		
		
		
		
		Button btnNext = new Button("Next");
		btnNext.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				imgNum = (imgNum+1)%4;
				iv.setImage(cards[imgNum]);
			}
			
		});
		Button btnBack = new Button("Back");
		btnBack.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				imgNum = ((imgNum-1)+4)%4;
				iv.setImage(cards[imgNum]);
			}
			
		});
		Button btnExit = new Button("Exit");
		btnExit.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				System.exit(0);
				
			}
			
		});
		btnNext.setPrefSize(100, 30);
		btnExit.setPrefSize(100, 30);
		btnBack.setPrefSize(100, 30);
		iv.setFitHeight(300);
		iv.setFitWidth(150);
		VBox buttonBox = new VBox(25);
		buttonBox.setAlignment(Pos.CENTER);
		HBox everyBox = new HBox(50);
		buttonBox.getChildren().addAll(btnNext, btnBack, btnExit);
		everyBox.getChildren().addAll(buttonBox,iv);
		Scene s = new Scene(everyBox);

		arg0.setScene(s);
		arg0.setTitle("My Card Game");
		arg0.show();
	}

}
