package oop;

import java.util.Scanner;
import oop.Car;
import static java.lang.System.out;

public class Student {
	//properties - instance variables
	int rollNumber;
	String name;
	int marks[] = new int[6]; //int array
	int total;
	int avg;
	char grade; // value 'A'
	
	static String collegeName;
	
	//default constructor - initialize the instance variables with default values
	//default values
	//byte, short, int, long - 0
	//float, double - 0.0
	//boolean - false
	//char - empty
	//Class objects - null
	
	Student() {}
	
	/*Student() {
		Scanner input = new Scanner(System.in); // reference variable - object
		System.out.println("Enter your roll number");
		rollNumber = input.nextInt();
		
		System.out.println("Enter your name:");
		name = input.next();
		
		System.out.println("Enter your six subject marks");
		for(int i = 0; i < marks.length; i++) {
			marks[i] = input.nextInt();
		}
	}*/
	
	//parameterized constructor
	
	//this - keyword, its like pointer - point current running object
	Student(int rollNumber, String name, int marks[]) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}
	
	Student(String name, int rollNumber, int marks[]) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}
	
	//Copy constructor (clone)
	Student(Student s) {
		rollNumber = s.rollNumber;
		name = s.name;
		marks = s.marks;
	}
	
	Student(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	int calculateTotal() {
		
		for(int value : marks) {
			total += value;
		}
		return total;
	}
	
	void calculateAverage() {
		avg = total / 6;
	}
	
	void calculateGrade() {
		if( avg >= 85  && avg <= 100 )
		    grade = 'A';
		else if(avg >= 70 && avg < 85)
			grade = 'B';
		else if(avg >= 50 && avg < 70) 
			grade = 'C';
		else if(avg >= 35 && avg < 50)
			grade = 'D';
		else grade = 'F';
	}
	
	void display() {
		out.println("Student name: "+ name);
		out.println("Student roll number: "+ rollNumber);
		out.println("Student six subject marks: \n");
		for(int value: marks) {
			out.print(value + " \t ");
		}
		
		out.println("Total marks: "+ total);
		out.println("Average : "+ avg);
		out.println("Grade: "+ grade);
		
		out.println("College name::" + collegeName);
	}

	public static void main(String[] args) {
		/*Student st1 = new Student();  // properties, behaviours
		st1.calculateTotal();
		st1.calculateAverage();
		st1.calculateGrade();
		st1.display();
		
		int subMarks[] = {79, 38, 49, 28, 48, 78}; 
		Student st2 = new Student(123, "abc", subMarks);  // properties, behaviours
		st2.calculateTotal();
		st2.calculateAverage();
		st2.calculateGrade();
		st2.display();
		
		Student st3 = new Student(st1);  // properties, behaviours
		st3.calculateTotal();
		st3.calculateAverage();
		st3.calculateGrade();
		st3.display();*/
		
		Student.collegeName = "XYZ College";
		
		int subMarks[] = {79, 38, 49, 28, 48, 78}; 
		Student st2 = new Student();  // properties, behaviours
		st2.name = "newName";
		st2.rollNumber = 123;
		st2.marks = subMarks;
		st2.display();
		
		Student st3 = new Student();  // properties, behaviours
		st3.name = "anotherName";
		st3.rollNumber = 1233;
		st3.marks = subMarks;
		st3.display();
		
		//ClassName.staticMember
		
		Student.collegeName = "New College";
		
		System.out.println();
		
		st2.display();
		st3.display();
		
	}

}
