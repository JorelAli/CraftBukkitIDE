package cbde.project;

import javax.swing.JDialog;

import cbde.windows.error;

public class Project {
	public void Project(String Project_Type, String Name, String Path){
		boolean Success = false;
		if (Project_Type == "new"){
		Success = Project_new.createProject(Name, Path);
		}
		
		
		
		
		if (Success == false){
			
			try{
				
				cbde.windows.error ErrorWindow = new error("Failed to Create Project!", "[PrintStackTrace]");
				ErrorWindow.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				ErrorWindow.setVisible(true);
				
			}catch(Exception e){
				
			}
			
		}
	}

}
