package com;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// Accept student rno, name, 6subjects marks, calculate total, avg and grade
		// Pseudo code
		
		//variable
		int rollNumber;
		String name;
		int s1, s2, s3, s4, s5, s6; //int array
		int total;
		int avg;
		char grade;
		//boolean isPass;
		
		//accept the input
		//ClassName objname = new ClassName();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your roll number");
		rollNumber = input.nextInt();
		
		System.out.println("Enter your name:");
		name = input.next();
		
		System.out.println("Enter your six subject marks");
		s1 = input.nextInt();
		s2 = input.nextInt();
		s3 = input.nextInt();
		s4 = input.nextInt();
		s5 = input.nextInt();
		s6 = input.nextInt();
		
		
		// calculations
		total = s1 + s2 + s3 + s4 + s5 + s6;
		avg = (int) total / 6;
		
		if( avg >= 85  && avg <= 100 )
		    grade = 'A';
		else if(avg >= 70 && avg < 85)
			grade = 'B';
		else if(avg >= 50 && avg < 70) 
			grade = 'C';
		else if(avg >= 35 && avg < 50)
			grade = 'D';
		else grade = 'F';
		
		//Print the output on the console
		System.out.println("Student name: "+ name);
		System.out.println("Student roll number: "+ rollNumber);
		System.out.println("Student six subject marks: \n"+ s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 + "\n" + s5 + "\n" + s6);
		System.out.println("Total marks: "+ total);
		System.out.println("Average : "+ avg);
		System.out.println("Grade: "+ grade);
		
		
		//A - >= 85, B- <85 && >=70, C - <70 && >=50, 
		//D - <50 && >=35,  F- < 35  
		
		//Conditional statements - if, if-else, if else ladder, nested if else
		//1. if( booleanExp ) stmts;
		//2. if(boolExp) stmts else stmts;
		
		//3. if(boolExp1) 
		//		stmts1 
		//	else if (exp2) 
		//		stmts2; 
		//	else if (exp)
		//	   	stmts3; 
		//		... 
		//	else stmts4;
		//
		// 4. if (exp1) {
		//       if(exp2) {
		//			stmts1;
		//		 } else {
		//			if(exp3) {
		//				stmts2;
		//			}
		//		 }
		//    } else {
		//		stmt3;
		//	  }
		
		/*int a = 10;
		if( a == 0) {
			System.out.println("a val is 0");
		} else if(a > 0) {
			System.out.println("a val is +ve number");
		} else {
			System.out.println("a val is -ve number");
		}*/
		
		
		
		
	}

}
