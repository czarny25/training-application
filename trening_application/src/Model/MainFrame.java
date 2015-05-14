package Model;

import java.awt.*;

import javax.swing.*;

import sun.awt.geom.AreaOp.AddOp;

public class MainFrame extends JFrame{
	
	
	
	private MainMenu menu = null;
	private WelcomePicturePanel welcomePanel = null;
	
	
	// main constructor
	public MainFrame(){		
		super("This is main");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setSize(new Dimension(900,600));
		
		// look and feel
				 try {
					UIManager.setLookAndFeel(
					            UIManager.getSystemLookAndFeelClassName());
				} catch (ClassNotFoundException | InstantiationException
						| IllegalAccessException | UnsupportedLookAndFeelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
		menu 		 = new MainMenu();
		welcomePanel = new WelcomePicturePanel("", 5);
		
		
		
		
		setJMenuBar(menu.createMainMenu());
		
		add(welcomePanel, BorderLayout.CENTER);
		
		
		
		
		setVisible(true);										
	    setResizable(true);
	    setLocationRelativeTo(null);
		
	}
	
	// this is main method that runs application 
	public static void main(String[] args) {
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	MainFrame mf = new MainFrame();
            }
        });
    }
	
}