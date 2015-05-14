package Helper_classes;

import java.io.File;
import java.util.Random;

/*
 *  the purpose of this class is to show how to fill array with group of items from given file directory
 */


public class Loading_items_toArray {

	
	static File images = new File("G:/JAVA/Ultimate Java Code Repository/4_Creating Graphical User Interfaces/Swing Projects/trening_application/src/Images");
	static String[]names = images.list();
	
	public static void main(String[] args) {
		
		
		File images = new File("G:/JAVA/Ultimate Java Code Repository/4_Creating Graphical User Interfaces/"
								+ "Swing Projects/trening_application/src/Images");
		String[]names = images.list();
		
		for(String image: names){
			System.out.println("this is all " + image + "\n");
		}
		
		System.out.println("\nand this is random value " + names[new Random().nextInt(names.length)]);
		
	}

}
