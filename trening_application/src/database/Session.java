package database;

import java.util.Date;

public class Session {

	int sessionId;
	Date sessionData;
	Set set;
	Excercise nameExcer;
	Muscle nameMuscle;
	
	
	
	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public Date getSessionData() {
		return sessionData;
	}

	public void setSessionData(Date sessionData) {
		this.sessionData = sessionData;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}

	public Excercise getNameExcer() {
		return nameExcer;
	}

	public void setNameExcer(Excercise nameExcer) {
		this.nameExcer = nameExcer;
	}

	public Muscle getNameMuscle() {
		return nameMuscle;
	}

	public void setNameMuscle(Muscle nameMuscle) {
		this.nameMuscle = nameMuscle;
	}

	public Session(){
		
	}
	
	public Session(int sessionId, Date sessionData, Set set, Excercise nameExcer, Muscle nameMuscle) {
		
		this.sessionId = sessionId;
		this.sessionData = sessionData;
		this.set = set;
		this.nameExcer = nameExcer;
		this.nameMuscle = nameMuscle;
	}

	
	
}

class Set{	
	
	private int id;
	int repetition;
	double weight;
}

class Excercise{		
	String name;
}

class Muscle{		
	String name;		
}












