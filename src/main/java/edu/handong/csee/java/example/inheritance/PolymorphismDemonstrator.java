package edu.handong.csee.java.example.inheritance;
/* PolymorphismDemonstrator.java is a program that show the concept of polymorphism in Java
 * It creates an array of Person objects, which can hold instances of both Undergraduate and Student classes, and displays the name and level of each person in the array
 * It also shows how to use the 'instanceof' operator to check the type of an object before casting it to a specific class
 * Finally, it demonstrates how an Undergraduate object can be assigned to variables of type Student, Person, and Object, and how to call methods on those variables
*/

public class PolymorphismDemonstrator {
	public static void main(String[] args) {
		Person[] people = new Person[4]; 

		people[0] = new Undergraduate("Cotty, Manny", 4910, 1);
		people[1] = new Undergraduate("Kick, Anita", 9931, 2);
		people[2] = new Student("DeBanque, Robin", 8812);
		people[3] = new Undergraduate("Bugg, June", 9901, 4);

		for (Person p : people) {
			System.out.println("Student Name: " + p.getName());
			
			// we can call getLevel only in Undergraduate by casting p (Person).
			// However, before cating we need to check if p is actually Undergraduate type by using 'instanceof'
			if(p instanceof Undergraduate){ 
				Undergraduate studentObj = (Undergraduate) p;
				System.out.println("Student Level: " + studentObj.getLevel());
			}
			System.out.println();
		} // we can also assign an Undergraduate object to variables of type Student, Person, and Object
		
		Undergraduate ug = new Undergraduate("Nam, JC", 1111, 4); // Create an instance of the Undergraduate class
		Student st = ug;
		Person ps = ug;
		Object obj = ug;
		
		st.writeOutput();
		ps.writeOutput();
		System.out.println(obj.toString());
	}
}