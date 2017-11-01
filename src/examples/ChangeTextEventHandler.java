package examples;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ChangeTextEventHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		Button b = (Button)event.getSource();
		if (b.getText().equals("BUP"))
				b.setText("WAH");
		else b.setText("BUP");
	}
	

}
