package oop;
/*
 * Polymorphism - Many Forms
 * 
 * 1. Static polymorphism - 
 * 		a. Method overloading - defining same method name with different impl within the same class.
 * 			Note: arguments only we can make change others
 * 
 * 		b. Constructor overloading
 * 			
 * 
 * 2. Dynamic polymorphism
 * 		a. method overriding - defining the same method (signature) in parent and child classes.
 */
public class PolymorphismDemo {
	
	int a, b;
	
	PolymorphismDemo() {
		a = 0; b = 0;
	}
	
	void setA(int a) {
		this.a = a;
	}
	
	void setB(int b) {
		this.b = b;
	}
	
	int add(int a, int b) {
		return a + b;
	}
	
	int add(int a, int b, int c) {
		c = a + b;
		return c;
	}
	
	void add(int a) {
		System.out.println(a + b);
	}
	
	int add() {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismDemo demo = new PolymorphismDemo();
		int c = demo.add(10, 20);
		System.out.println("sum = "+ c); // 30
		int d = demo.add();
		System.out.println("sum = "+ d); // 0
		demo.add(90); // 90
		
		demo.setA(50);
		demo.setB(60);
		int e = demo.add();
		System.out.println("sum = "+ e); // 0
		
	}

}
