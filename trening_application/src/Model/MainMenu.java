package Model;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainMenu {

	private JMenuBar menuBar = null;	
	
	public JMenuBar createMainMenu(){
		
		menuBar = new JMenuBar();		
		
		JMenu 	  user 		    = new JMenu("User");
		JMenuItem lastTreining  = new JMenuItem("Go to your training");
		user.add(lastTreining);
		
		
		JMenu view 		         = new JMenu("View");
		JMenuItem viewTrainings  = new JMenuItem("View all trainings");
		JMenuItem createTraining = new JMenuItem("Create new Training");
		view.add(viewTrainings);
		view.add(createTraining);
		
		JMenu excercise           = new JMenu("Excercise");
		JMenuItem createExcercise = new JMenuItem("Create new Excercise");
		excercise.add(createExcercise);
		
		menuBar.add(user);
		menuBar.add(view);
		menuBar.add(excercise);
		
		
		return menuBar;
		
		
	}
	
}	