package examples;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ExitEventHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		System.exit(0);
		
	}

}
