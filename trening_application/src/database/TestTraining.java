package database;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



public class TestTraining {

	
	
	public static void main(String[] args) {
		
		Session session = new Session();
		Set set = new Set();
		Excercise excercise = new Excercise();
		Muscle muscle = new Muscle();
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		
//		Session session = new Session(1, date, session.setSet(set), session.setNameExcer("bar push"), "chest");
		
		

	}

}
