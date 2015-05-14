package Model;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomePicturePanel extends JPanel{

	ImageIcon background = null;
	JLabel imageLabel = null;
	
	public WelcomePicturePanel(String title, int interspace){
			
		
		setLayout(new BorderLayout());
		
		// border for this panel
		setBorder(BorderFactory.createTitledBorder(title));	
		setBorder(BorderFactory.createCompoundBorder(
						BorderFactory.createEmptyBorder(interspace, interspace, interspace, interspace), 
						BorderFactory.createTitledBorder(title)));
	
//		Random picture from ArrayList is set on desktop
		loadPictures(pictureStorage());
		
	}
	
	// this method will load pictures from given file to an array
	public void loadPictures(String image){
		
		background = new ImageIcon(getClass().getResource(image));	
		imageLabel = new JLabel(background);
		imageLabel.setForeground(Color.BLUE);
		add(imageLabel);
	}
	
	
	public String pictureStorage(){
		
		String path = "G:/JAVA/Ultimate Java Code Repository/4_Creating Graphical User Interfaces/"
                + "Swing Projects/trening_application/src/Images";
		
		File images = new File(path);
		
		String[]names = images.list();
		String imageIcon = names[new Random().nextInt(names.length)];
		
		return "/Images/" +imageIcon;
	}
	
	
	
	
	
	
	
}






















