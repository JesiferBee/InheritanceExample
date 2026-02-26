package edu.handong.csee.java.example.inheritance;
/* Undergraduate.java is a class that extends Student and adds a level field
 * It has a default constructor that sets the level to 1 and a constructor that allows setting the name, student number, and level
 * It also has getter and setter methods for the level, a method to write the output of the undergraduate's information, and a method to compare two Undergraduate objects based on their name, student number, and level
*/

public class Undergraduate extends Student {
	private int level; 	//1 for freshman, 2 for sophomore 
						//3 for junior, or 4 for senior. 

	public Undergraduate()    { 
		super();        
		level = 1;  //Default level is 1  
	} 

	public Undergraduate(String initialName, int initialStudentNumber, int initialLevel) { 
		super(initialName, initialStudentNumber);        
		setLevel(initialLevel); //checks 1 <= initialLevel <= 4    
	}

	public void reset(String newName, int newStudentNumber, int newLevel) { 
		reset(newName, newStudentNumber); //Student's reset        
		setLevel(newLevel); //Checks 1 <= newLevel <= 4    
	}

	public int getLevel() {
		return level;    //Getter method for the level
	} 

	public void setLevel(int newLevel)    {
		if ((1 <= newLevel) && (newLevel <= 4))           
			level = newLevel;
		else {
			System.out.println("Illegal level!");            
			System.exit(0);       
		}    //Setter method for the level with a check to ensure the level is between 1 and 4
	} 

	public void writeOutput()    { 
		super.writeOutput();        
		System.out.println("StudentLevel: " + level);    //Method to write the output of the undergraduate's information
	} 

	public boolean equals(Undergraduate otherUndergraduate) { 
		return equals((Student)otherUndergraduate) && (this.level == otherUndergraduate.level);   //Compare two Undergraduate objects based on their name, student number, and level 
	} 
}
