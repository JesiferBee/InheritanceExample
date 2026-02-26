package edu.handong.csee.java.example.inheritance;
/* Student.java is a class that extends Person and adds a student number field
 * It has a default constructor that sets the student number to 0 and a constructor that allows setting the name and student number
 * It also has getter and setter methods for the student number, a method to write the output of the student's information, and a method to compare two Student objects based on their name and student number
*/

public class Student extends Person{
	
	private int studentNumber;
	public Student()    {
		super();        
		studentNumber = 0;//Indicating no number yet    
	}
	
	public Student(String initialName, int initialStudentNumber){
		super(initialName);        
		studentNumber = initialStudentNumber;    //Set the name and student number 
	}
	
	public void reset(String newName, int newStudentNumber) {
		setName(newName);        
		studentNumber = newStudentNumber; //Reset the name and student number
	}
	
	public int getStudentNumber() {
		return studentNumber; //Getter method for the student number
	}
	
	public void setStudentNumber(int newStudentNumber) {
		studentNumber = newStudentNumber; //Setter method for the student number
	}
	
	public void writeOutput() {
		System.out.println("Name: " + getName());
		System.out.println("Student Number: " + studentNumber);  //Method to write the output of the student's information
	}
	
	public boolean equals(Student otherStudent) {
		return this.hasSameName(otherStudent) && (this.studentNumber == otherStudent.studentNumber); //Compare two Student objects based on their name and student number
	} 

}
