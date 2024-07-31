/*  
 A java singleton class is a class that can have only one object (an instance of the class) at a time. 
 After the first time, if we try to instantiate the Java Singleton classes, the new variable also points to 
 the first instance created
 whatever modifications we do to any variable inside the class through any instance, affects the variable of the 
 single instance created and is visible if we access that variable through any variable of that class type defined.
 
 **PURPOSE OF SINGLETON CLASS
 The primary purpose of a java Singleton class is to restrict the limit of the number of object creations to only one.
  This often ensures that there is access control to resources, for example, socket or database connection
  
======Key points while defining a class as a singleton class that is while designing a singleton class:========  
Make a constructor private.
Write a static method that has the return type object of this singleton class.

 */
package Student;

class singleton{
	private static singleton single_instance = null; // Static variable reference of single_instance of type Singleton
	//private static singleton single_instance2= null;  NOT ALLOWED
	public String s;
	
	private singleton() {
		s="Enjoy";
	}
	
	public static synchronized singleton getInstance() { 
		// By synchronizing the method, you ensure that the singleton instance is created only once, 
		//even when multiple threads attempt to access the method simultaneously.
	if(single_instance == null) {
		single_instance = new singleton();
		single_instance2 = new singleton();
	}
	return single_instance;
	}
	
}

class GFG {

	public static void main(String[] args) {
		singleton x = singleton.getInstance(); // 
		singleton y = singleton.getInstance();
		singleton z = singleton.getInstance();
		
		System.out.println("Hashcode of x is "+ x.hashCode());
		System.out.println("Hashcode of y is "+ y.hashCode());
		System.out.println("Hashcode of z is "+ z.hashCode());
		
		if (x==y && y==z) {
			System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");
		}
		else {
			System.out.println("Three objects DO NOT point to the same memory location on the heap");
		}
	}
}
