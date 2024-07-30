package Student;

abstract class Shape{
	abstract double calculateArea();
}

class Circle extends Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	double calculateArea(){
		return Math.PI*radius*radius;
	}
}

class abstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle(7);
		System.out.println(circle.calculateArea());
	}

}

/*abstract class Animal {
    // Abstract method (does not have an implementation)
    abstract void makeSound();
    
    // Concrete method (with implementation)
    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

class Dog extends Animal {
    // Implementation of the abstract method
    void makeSound() {
        System.out.println("Woof");
    }
}*/


/* Concrete class instead of abstract class
public class Animal {
    // Method with implementation
    void makeSound() {
        System.out.println("Some sound");
    }
    
    // Method with implementation
    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

public class Dog extends Animal {
    // Override the makeSound method
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}
*/