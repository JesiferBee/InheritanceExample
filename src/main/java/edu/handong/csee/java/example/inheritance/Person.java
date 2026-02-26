package edu.handong.csee.java.example.inheritance;
/* Person.java is a class shows a person with a name
 * It has a default constructor that sets the name to "No name yet" and a constructor that allows setting the name
 * It also has getter and setter methods for the name, a method to write the output of the person's information, and a method to compare the names of two Person objects
*/

public class Person {
	private String name;

	public Person() {
		name = "No name yet"; // Default constructor set to "No name yet"
	}
	public Person(String initialName)    {  
		name = initialName;    // Constructor that allows setting the name
	} 

	public void setName(String newName) {
		name = newName;    // Setter method for the name
	} 

	public String getName() {
		return name;  // Getter method for the name
	} 

	public void writeOutput() {
		System.out.println("Name: " + name); 	// Method to write the output of the person's information
	} 

	public boolean hasSameName(Person otherPerson) {
		return this.name.equalsIgnoreCase(otherPerson.name);  // Method to compare the names of two Person objects
	} 
}