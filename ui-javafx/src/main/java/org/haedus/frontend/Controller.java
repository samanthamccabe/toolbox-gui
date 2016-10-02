package org.haedus.frontend;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;

/**
 * Samantha Fiona Morrigan McCabe
 * Created: 2/3/2016
 */
public class Controller {

	public static final int PORT = 22227;
	
	private final Workspace workspace = new Workspace();

	@FXML
	WebView webView;
	WebEngine engine;
	
	public void init(){
		engine = webView.getEngine();
		engine.load("localhost:" + PORT + "/index.html");
	}
	
	public void openFile(ActionEvent actionEvent) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Project");
		File file = fileChooser.showOpenDialog(null);
		if (file != null) {
			//TODO: do things here
			try {
				Project project = new Project(file);
				workspace.addProject(file.getName(), project);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void newFile(ActionEvent actionEvent) {
		//TODO: how do i make a new a project idk
	}

	public void saveFile(ActionEvent actionEvent) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Save Project");
		File file = fileChooser.showOpenDialog(null);
		if (file != null) {
			//TODO: do things here
		}
	}

	public void closeFile(ActionEvent actionEvent) {
		//TODO: how do i close a project idk
	}
}