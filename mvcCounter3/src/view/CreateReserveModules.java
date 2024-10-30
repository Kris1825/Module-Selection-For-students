package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import model.Module;

public class CreateReserveModules  extends Accordion{
	private ListView<Module> UnselectedT1, UnselectedT2 ; 
	private ListView<Module> ReservedT1,ReservedT2 ; 
	private Button addBtnT1,removeBtnT1,confirmBtnT1,
	addBtnT2,removeBtnT2,confirmBtnT2;

	public CreateReserveModules() {
		
	
		
		
		
		VBox container = new VBox();
		
		 HBox hbox1 = new HBox();
		  VBox vbox2 = new VBox();
		    this.UnselectedT1 = new ListView<Module>();
		    VBox vbox3 = new VBox();
		       Label l1 = new Label("Unselected Term1 modules");
		  VBox vbox4 = new VBox();
		    VBox vbox5 = new VBox();
		       Label l2 = new Label("Reserved Term1 modules");
		    this.ReservedT1 = new ListView<Module>();
		 HBox hbox2 = new HBox(10);
		 hbox2.setAlignment(Pos.CENTER);
		   Label l3 = new Label("Reserve 30 credits worth of term 1 modules ");
		   this.addBtnT1 = new Button("Add");
		   this.removeBtnT1 = new Button("Remove");
		   this.confirmBtnT1 = new Button("Confirm");
		   
		hbox2.getChildren().addAll(l3,addBtnT1,removeBtnT1,confirmBtnT1);
		vbox5.getChildren().add(l2); 
		vbox4.getChildren().addAll(vbox5,ReservedT1);
		vbox3.getChildren().add(l1);
		vbox2.getChildren().addAll(vbox3,UnselectedT1);
		hbox1.getChildren().addAll(vbox2,vbox4);
		container.getChildren().addAll(hbox1,hbox2);
		
		HBox.setHgrow(vbox2, Priority.ALWAYS);
		HBox.setHgrow(vbox4, Priority.ALWAYS);
		VBox.setMargin(hbox1, new Insets(60,0,0,0));
		HBox.setMargin(UnselectedT1, new Insets(0,0,0,40));
		HBox.setMargin(vbox2, new Insets(0,0,10,70));
		HBox.setMargin(vbox4, new Insets(0,15,10,70));
		VBox.setMargin(hbox2, new Insets(15,0,0,0));
		
		
		// *********** TERM2 **************************
		
		
		
	
		VBox containerT2 = new VBox();
		
		 HBox hbox1T2 = new HBox();
		  VBox vbox2T2 = new VBox();
		    this.UnselectedT2 = new ListView<Module>();
		    VBox vbox3T2 = new VBox();
		       Label l1T2 = new Label("Unselected Term2 modules");
		  VBox vbox4T2 = new VBox();
		    VBox vbox5T2 = new VBox();
		       Label l2T2 = new Label("Reserved Term2 modules");
		    this.ReservedT2 = new ListView<Module>();
		 HBox hbox2T2 = new HBox(10);
		 hbox2T2.setAlignment(Pos.CENTER);
		   Label l3T2 = new Label("Reserve 30 credits worth of term 2 modules ");
		   this.addBtnT2 = new Button("Add");
		   this.removeBtnT2 = new Button("Remove");
		   this.confirmBtnT2 = new Button("Confirm");
		   
		hbox2T2.getChildren().addAll(l3T2,addBtnT2,removeBtnT2,confirmBtnT2);
		vbox5T2.getChildren().add(l2T2); 
		vbox4T2.getChildren().addAll(vbox5T2,ReservedT2);
		vbox3T2.getChildren().add(l1T2);
		vbox2T2.getChildren().addAll(vbox3T2,UnselectedT2);
		hbox1T2.getChildren().addAll(vbox2T2,vbox4T2);
		containerT2.getChildren().addAll(hbox1T2,hbox2T2);
		
		HBox.setHgrow(vbox2T2, Priority.ALWAYS);
		HBox.setHgrow(vbox4T2, Priority.ALWAYS);
		VBox.setMargin(hbox1T2, new Insets(60,0,0,0));
		HBox.setMargin(UnselectedT1, new Insets(0,0,0,40));
		HBox.setMargin(vbox2T2, new Insets(0,0,10,70));
		HBox.setMargin(vbox4T2, new Insets(0,15,10,70));
		VBox.setMargin(hbox2T2, new Insets(15,0,0,0));
		
		
		TitledPane term1 = new TitledPane("Term 1 modules ", container);
		TitledPane term2 = new TitledPane("Term 2 modules", containerT2);
		
		this.getPanes().addAll(term1,term2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
