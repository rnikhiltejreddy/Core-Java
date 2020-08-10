package oop;

public class Car { // class also data type
	//properties
	String brandName; // null
	String model; // null
	int fuelLevel; // 0
	
	//object default value null
	
	
	//behaviour / Methods /function
	void display() {
		System.out.println("Brand::" + brandName);
		System.out.println("Model::" + model);
		System.out.println("fuelLevel::" + fuelLevel);
		fuelLevel = checkFuelLevel();
		setBrandName("BMW");
		setModelName("X-20");
		System.out.println("Car Brand:" + brandName);
		System.out.println("Model::" + model);
		System.out.println("Fuel level % ::" + fuelLevel);
	}
	
	int checkFuelLevel() {
		int level = 70;
		return level;
	}
	
	void setBrandName(String name) {
		brandName = name;
	}
	
	void setModelName(String name) {
		model = name;
	}
	
	public static void main(String[] args) {
		Car bmw = new Car(); // classname objname = new classname(argls);
		bmw.display();
	}
}

//methods
	 //1. with return type with arguments 
	// 2. with returntype without arguments (empty)
	// 3. with out return type (void)  with argums 
	// 4. with out return type (void) with out argumnets (empty)
