package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class rootcontroller implements Initializable {
	@FXML private TextField t1;
	@FXML private TextField t2;
	@FXML private TextField t3;
	@FXML private TextField rt1;
	@FXML private TextField rt2;
	@FXML private TextField rt3;

	@Override
	public void initialize(URL location,ResourceBundle resource) {
	}
	
	public void action(ActionEvent e)
	{
		String title = t1.getText();
		rt1.setText(title);
		String title1 = t2.getText();
		rt2.setText(title1);
		String title2 = t3.getText();
		rt3.setText(title2);
	}
	
	public void exist(ActionEvent e) {
		Platform.exit();
	}
}
