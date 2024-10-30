

package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import model.Module;

public class CreateSelectModulesPane extends GridPane {
	private Button AddT1,removeT1, addTerm2,removeT2,Reset,Submit;
	private ListView<Module> USTerm1, USTerm2, SYLM,STerm1,StTerm2 ;
	private Label Term1Credits,Term2Credits ; 
	
	public CreateSelectModulesPane() {
		
		// 0.0 
		
		HBox hbox1 = new HBox(); 
		VBox vbox1 = new VBox();
		
		Label l1 = new Label("Unselected Term 1 modules"); 
		
		this.USTerm1 = new ListView<Module>() ;
		USTerm1.setPrefSize(300, 140);
		
		
		
		HBox hbox2 = new HBox(8);
		hbox2.setSpacing(8);
		hbox2.setPadding(new Insets(10,20,10,20));
		
		Label t1 = new Label("Term 1");
		this.AddT1 = new Button("Add");
		this.removeT1 = new Button ("Remove"); 
		AddT1.setPrefSize(70, 30);
		removeT1.setPrefSize(70, 30);
		hbox2.getChildren().addAll(t1,AddT1,removeT1);
		vbox1.getChildren().addAll(l1,USTerm1,hbox2 ); 
		hbox1.getChildren().add(vbox1); 
		this.add(hbox1, 0, 0);
		HBox.setMargin(hbox1, new Insets(20,20,20,20));
		HBox.setHgrow(vbox1, Priority.ALWAYS);
		// 0. 0 
		
		
		// 0.1 
		
		 
		
		 
		 
			HBox hbox3 = new HBox(); 
			
			VBox vbox2 = new VBox(); 
			Label l2 = new Label("Unselected Term 2 modules"); 
			
			
			 
			this.USTerm2 = new ListView<Module>() ;
			USTerm2.setPrefSize(300, 140);
			
			HBox hbox4 = new HBox(8);
			hbox4.setSpacing(8);
			hbox4.setPadding(new Insets(10,20,10,20));
			
			Label t2 = new Label("Term 2");
			this.addTerm2 = new Button("Add");
			this.removeT2 = new Button ("Remove"); 
			
			addTerm2.setPrefSize(70, 30);
			removeT2.setPrefSize(70, 30);
			 hbox4.getChildren().addAll(t2,addTerm2,removeT2);
			 
			 
			 vbox2.getChildren().addAll(l2,USTerm2,hbox4);
			 hbox3.getChildren().add(vbox2); 
			 this.add(hbox3, 0, 1);
			 HBox.setMargin(hbox3, new Insets(20,20,20,20));
			 // 0.1 
			 
			 
			 
			 // 0.3 
			 HBox hbox9 = new HBox();
			
			 Label l3 = new Label("Current term1 credits: "); 
			 this.Term1Credits = new Label("");
			 hbox9.getChildren().addAll(l3,Term1Credits); 
			 hbox9.setPadding(new Insets(10,10,10,50));
		
			this.Submit = new Button("Submit") ; 
			VBox vbox7 = new VBox();
			vbox7.setAlignment(Pos.CENTER_RIGHT);
			vbox7.getChildren().addAll(hbox9,Submit);
			HBox hbox10 = new HBox();
			hbox10.getChildren().add(vbox7);
			this.add(hbox10, 0, 3);
			// 0.3 
			 
		//  1.0 
			 
			 VBox vbox3 = new VBox(); 
			 Label r1 = new Label("Selected Year Long modules"); 
			 this.SYLM  = new ListView<Module>(); 
			 SYLM.setPrefHeight(50);
			 vbox3.getChildren().addAll(r1,SYLM);
			 vbox3.setPadding(new Insets(0,10,20,10));
			 HBox hbox5 = new HBox(); 
			 hbox5.getChildren().add(vbox3); 
			 this.add(hbox5, 1, 0);
			 // 1.0 
			 
			 // 1.1
			 
			 VBox vbox4 = new VBox(); 
			 Label r2 = new Label("Selected Term 1 modules");
			 this.STerm1 = new ListView<Module>(); 
			 vbox4.setPadding(new Insets(10,10,20,10));
			 vbox4.getChildren().addAll(r2,STerm1); 
			 STerm1.setPrefHeight(100);
			 HBox hbox6 = new HBox();
			 hbox6.getChildren().add(vbox4);
			this.add(hbox6, 1, 1);
			 // 1.1 
			 
			 //1.2 
			 
			 VBox vbox5 = new VBox();
			 Label r3 = new Label (" Selected Term 2 modules") ; 
			 this.StTerm2 = new ListView<Module>(); 
			 vbox5.setPadding(new Insets(10,10,20,10));
			 vbox5.getChildren().addAll(r3,StTerm2); 
			 StTerm2.setPrefSize(300, 150);
			 HBox hbox7 = new HBox();
			 hbox7.getChildren().add(vbox5);
			 this.add(hbox7, 1, 2);
			 // 1.2 
			 
			 //1.3 
			 VBox vbox6 = new VBox(); 
			 HBox hbox8 = new HBox(8); 
			 Label r4 = new Label("Current term 2 credits: ");
			 this.Term2Credits = new Label("") ; 
			 hbox8.getChildren().addAll(r4,Term2Credits); 
			 hbox8.setAlignment(Pos.BOTTOM_CENTER);
			 this.Reset = new Button("Reset"); 
			 vbox6.getChildren().addAll(hbox8,Reset);
			 this.add(vbox6, 1, 3);
			 // 1.3 
			 
		
		
	}
}
