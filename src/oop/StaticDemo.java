package oop;

final public class StaticDemo { // final classes are not able to inherit
	
	//Encapsulation: class
	
	
	int a; // default access modifier -package scope
	public static int b;
	public final int MAX_MEMBERS = 10; 
	
	
	static {
		System.out.println("static block");
		b = 20;
	}
	
	public StaticDemo() {
		System.out.println("constructor block");
		a = 10;
	}
	
	void display() {
		System.out.println("a = "+a);
	}
	
	static void staticFunction() {
		System.out.println("b = "+b);
	}
	
	final void finalMethod() { // final methods are not able override in child
		System.out.println("It's a final method");
	}
	
	public static void main(String[] args) {
		StaticDemo obj = new StaticDemo();
		obj.a = 20;
		obj.display();
		
		StaticDemo.staticFunction();
	}
}
