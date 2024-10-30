package view;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.BorderPane;


public class ModuleSelectionToolRootPane extends BorderPane {

	private CreateStudentProfilePane cspp;
	private ModuleSelectionToolMenuBar mstmb;
	private TabPane tp;
	private CreateSelectModulesPane csmp ;
	private CreateOverwiewSelection cos ;
	private CreateReserveModules crm ;
	public ModuleSelectionToolRootPane() {
		//create tab pane and disable tabs from being closed
		tp = new TabPane();
		tp.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		
		//create panes
		cspp = new CreateStudentProfilePane();
		csmp = new CreateSelectModulesPane();
		cos = new CreateOverwiewSelection();
		crm = new CreateReserveModules();
		//create tabs with panes added
		Tab t1 = new Tab("Create Profile", cspp);
		Tab t2 = new Tab("select modules",csmp);
		Tab t3 = new Tab("Reserve Modules", crm);
		Tab t4 = new Tab("Overwiew Selection", cos);
		//add tabs to tab pane
		tp.getTabs().addAll(t1,t2,t3,t4);
		
		//create menu bar
		mstmb = new ModuleSelectionToolMenuBar();
		
		//add menu bar and tab pane to this root pane
		this.setTop(mstmb);
		this.setCenter(tp);
		
	}

	//methods allowing sub-containers to be accessed by the controller.
	public CreateStudentProfilePane getCreateStudentProfilePane() {
		return cspp;
	}
	
	public ModuleSelectionToolMenuBar getModuleSelectionToolMenuBar() {
		return mstmb;
	}
	
	//method to allow the controller to change tabs
	public void changeTab(int index) {
		tp.getSelectionModel().select(index);
	}
}
