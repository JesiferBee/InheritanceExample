package edu.handong.csee.java.example.inheritance;
/* InheritanceDemonstrator.java is a program that demonstrates the concept of inheritance in Java
 * It creates an instance of the Student class, which is a subclass of the Person class, and sets the name and student number for the student
 * Finally, it calls the writeOutput method to display the student's information
*/
public class InheritanceDemonstrator { //main method

	public static void main(String[] args) {
		 Student s = new Student();
		 s.setName("Warren Peace");
		 s.setStudentNumber(1234);
		 s.writeOutput();
	}

}
