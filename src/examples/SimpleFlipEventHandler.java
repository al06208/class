package examples;

import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class SimpleFlipEventHandler implements EventHandler<MouseEvent>{

	@Override
	public void handle(MouseEvent arg0) {
		ImageView iv = (ImageView)arg0.getSource();
		if (iv.getRotate()==180)
			iv.setRotate(0);
		else iv.setRotate(180);
		
	}

}
