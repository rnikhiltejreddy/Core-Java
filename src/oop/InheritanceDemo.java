package oop;

/*
 * Associations:
 * 1. HAS-A - one class has a another class ( Car has a Wheel)
 * 2. IS-A - one class is a child of another class ( inheritance )
 * 
 * 
 * Inheritance type
 * super keyword
 * constructor chaining
 * 
 */


/*
 *  Every class  is a child of Object
 */

class Address {
	
	String city;
	String state;
	String pin;
	
	public Address() {
	}

	public Address(String city, String state, String pin) {
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	
	void display() {
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("Pin code: "+pin);
	}
}


class Employee {
	int eid;
	String name;
	Address address;
	float salary;
	boolean empType;
	
	public Employee() {
		address = new Address();
	}
	
	public Employee(int eid, String name, String city, String state, String pin, float salary, boolean type) {
		this.eid = eid;
		this.name = name;
		address = new Address(city, state, pin);
		this.salary = salary;
		empType = type;
	}
	
	void displayEmployeeDetails() {
		System.out.println("Employee type:"+(empType ? "Perminant":"Contract"));
		System.out.println("employee Id:"+ eid);
		System.out.println("employee Name:"+ name);
		System.out.println("employee Salary:"+ salary);
		address.display();
	}
}

class PerminantEmployee extends Employee {
	//employee
	float allowences;
	String billCycle = "monthly";
	
	void calcAllowences() {
		allowences = 2000f;
	}
	
	void calSalary() {
		salary = salary + allowences;
	}
	
	public PerminantEmployee() {
		//super();
	}
	
	public PerminantEmployee(float allowences, String billCycle) {
		//super(); //calls super / parent class - default constructor
		//super / parent class constructor
		this.allowences = allowences;
		this.billCycle = billCycle;
	}

	public PerminantEmployee(int eid, String name, float salary, boolean type,
			String city, String state, String pin, float allowences,
			String billCycle) {
		super(eid, name, city, state, pin, salary, type);
		this.allowences = allowences;
		this.billCycle = billCycle;
	}

	public void displayDetails() {
		displayEmployeeDetails();
		System.out.println("Salary type: "+billCycle);
		System.out.println("Allowences: "+allowences);
	}
}

class ContractEmployee extends Employee {
	float perHour;
	int totalHours;
	String endDate;
	
	public ContractEmployee() {}

	public ContractEmployee(float perHour, int totalHours, String endDate) {
		this.perHour = perHour;
		this.totalHours = totalHours;
		this.endDate = endDate;
	}
	
	public ContractEmployee(int eid, String name, float salary, boolean type,
			String city, String state, String pin, float perHour,
			int totalHours, String endDate) {
		super(eid, name, city, state, pin, salary, type);
		this.perHour = perHour;
		this.totalHours = totalHours;
		this.endDate = endDate;
	}
	
	void calSalary() {
		salary = totalHours * perHour;
	}
	
	void displayDetails() {
		displayEmployeeDetails();
		System.out.println("Pay scale (hourly) :"+perHour);
		System.out.println("Total hours:"+totalHours);
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		/*PerminantEmployee employee1 = new PerminantEmployee(101, "Brahmaiah Cheeli", 500000, true, "Hyd", "TG", "500060", 5000, "Monthly"); //
		employee1.calSalary();
		employee1.displayDetails();*/
		
		ContractEmployee employee2 = new ContractEmployee(101, "Someone", 500000, false, "Hyd", "TG", "500060", 2000, 500, "30-Aug-2020"); //
		employee2.calSalary();
		employee2.displayDetails();
	}

}
