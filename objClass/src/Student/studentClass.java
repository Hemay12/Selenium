package Student;

public class studentClass {
	
	int age = 22;
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a object 
		
//		Combining these, the statement studentClass s1 = new studentClass(); does the following:
//
//			Declaration: Declares a variable s1 of type studentClass.
//			Instantiation: Uses the new keyword to allocate memory for a new studentClass object.
//			Initialization: Calls the studentClass constructor to initialize the new object.
			
		studentClass s1 = new studentClass(); // s1 is the object name. 
		System.out.println(s1.age);
		System.out.println(s1.name);

	}

}
