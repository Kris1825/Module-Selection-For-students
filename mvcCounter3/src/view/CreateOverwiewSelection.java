package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import model.Module;
import model.StudentProfile;

public class CreateOverwiewSelection extends VBox{
	
	private TextArea OverwiewProfile ;
	private TextArea selectedModules ;
	private TextArea reservedModules;
	private Button btnSaveOverview;

	public CreateOverwiewSelection() {
		
		HBox box1 = new HBox();
		box1.setAlignment(Pos.TOP_CENTER);
		
		box1.setPadding(new Insets(20,30,20,30));
		this.OverwiewProfile = new TextArea("Student Profile ");
		
		OverwiewProfile.setPrefHeight(140);
		box1.getChildren().add(OverwiewProfile);
		
		HBox.setHgrow(OverwiewProfile, Priority.ALWAYS);
		this.selectedModules = new TextArea("Selected modules ");
		this.reservedModules = new TextArea("Reserved modules "); 
		
	
		
		
		HBox box3 = new HBox(); 
		
		box3.setPadding(new Insets(30,15,30,15));
		box3.getChildren().add(selectedModules);
		selectedModules.setPrefSize(250, 300);
		HBox.setHgrow(selectedModules, Priority.ALWAYS);
		HBox.setHgrow(reservedModules, Priority.ALWAYS);

		HBox.setMargin(selectedModules, new Insets(15,20,20,20));
		HBox.setMargin(reservedModules, new Insets(15,20,20,20));
		HBox.setMargin(OverwiewProfile, new Insets(20,20,10,20));
		
		reservedModules.setPrefSize(250, 300);
		box3.getChildren().add(reservedModules);
		
		
		
		
		HBox box2 = new HBox(); 
		
		box2.setAlignment(Pos.BOTTOM_CENTER);
		box2.setPadding(new Insets(20,10,20,10));
		this.btnSaveOverview = new Button("Save Overview");
		
		box2.getChildren().add(btnSaveOverview);
		
		VBox container = new VBox();
		container.setAlignment(Pos.CENTER);
		container.getChildren().addAll(box1,box3,box2);
		this.getChildren().add(container);
		
	}

	
}
