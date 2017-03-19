package application;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class Prueba implements Initializable {
	@FXML
	private TextField txtHello;
	@FXML
	private Button btnPrueba;

	@Override	
	public void initialize(URL location, ResourceBundle resources) {	
		
	}
	@FXML
	private void MiAccion(MouseEvent e){
		txtHello.setText("Hello!");
	}
	@FXML
	private void MiAccion2(ActionEvent e){
		txtHello.setText("Hola!");
	}
}	
