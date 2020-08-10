package com;

import java.util.Scanner;

public class LoopStatements {

	public static void main(String[] args) {
		//Looping statements / Iteration 
		// for, while, do-while, forEach
		//for syntax-> for(initialization; condition; increment / decrement) {
		//   statements
		//}

		//for
		/*for(int i = 1; i <= 100; i++) { // Hello need to print 10 times
			System.out.println("Hello");
		}*/
		
		//print 10, 9, 8, 7, ... 1
//		for(int i = 10; i >=1; i--) {
//			System.out.println(i);
//		}
		
		//print sum of 1 to 10
//		int sum = 0;
//		for(int i = 1; i <= 10; i++) { //i = 1 , sum = 0, sum = 0 + 1 -> sum = 1
//			sum = sum + i;			  // i = 2, sum = 1, sum = 1 + 2 -> sum = 3
//		}
//		System.out.println(sum);
		
		// print the sum of even numbers b/w 1 to 10
//		int sum = 0;
//		for(int i = 1; i <= 10; i++) { // 4 % 2 == 0 -
//			if(i % 2 == 0)
//				sum = sum + i;			  
//		}
//		System.out.println(sum);
		
		
		// i = 1
		// sysout(i++); 1  i = 2
		// sysout(++i); 3  i = 3
		// i++;  i = 4
		// ++i;  i = 5
		
		//while
		// syntax - while ( condition ) { //code }
		// to print 1 to 10
//		int i = 1;
//		while ( i <= 10 ) {
//			System.out.println(i);
//			i++;
//		}
		
		//output
		// 1 to 10
		
		// print sum of digits of the given number
		// 5624 -> 5 + 6 + 2 + 4  = 17
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter any number");		
//		int number = in.nextInt(); // 654
//		int sum = 0, r;
//		while (number > 0) {
//			r = number % 10; //654 % 10 -> r = 4, 65 % 10 -> r = 5, 6 % 10 -> r = 6
//			sum = sum + r;   // 0 + 4 = 4, 4 + 5 = 9, 9 + 6 = 15
//			number = number / 10; // 654 / 10 -> number = 65, 65 / 10 -> number = 6, 6 / 10 - 0
//		}
//		System.out.println("Sum of digits of the given number is: "+sum);
		
		// print the reverse of the given number
		// 654 -> 456
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter any number");		
//		int number = in.nextInt(); // 654
//		int rev = 0, r, tmp = number;
//		while (tmp > 0) {
//			r = tmp % 10; //654 % 10 -> r = 4, 65 % 10 -> r = 5, 6 % 10 -> r = 6
//			rev = rev * 10 + r;   // 0 * 10 + 4 = 4, 4 * 10 + 5 = 45, 45 * 10 + 6 = 456
//			tmp = tmp / 10; // 654 / 10 -> tmp = 65, 65 / 10 -> tmp = 6, 6 / 10 - tmp = 0
//		}
//		System.out.println("Reverse of the given number is: "+rev);
//		if(number == rev)
//			System.out.println("Palindrom");
//		else 
//			System.out.println("Not a palindrome");
//		
		
		
		//do - while - 
		// it guarantees at least one time, execution
		// interactive programs
		// sysntax: do { //code } while (condition);
		
		
		int number;
		Scanner in = new Scanner(System.in);
		char preference;
		do {
			System.out.println("Enter any number");
			number = in.nextInt();
			
			if( number % 2 == 0) {
				System.out.println("Given number is even");
			} else {
				System.out.println("Given number is odd");
			}
			System.out.println("Do you want to try another number (Y/N) ?");
			preference = in.next().charAt(0); //"Y" -> 'Y'
			
		} while(preference == 'Y' || preference == 'y');
		System.out.println("Exit");
		
		
		//switch case: 
		//syntax:
		// switch ( expression ) { // int, char
		//  case value1: 
		//  		statemstes;
		//		break;
		//  case value2: 
		//		stmts;
		//		break;
		//  ...
		//  default: 
		//		stmts;
		//	}
		
		// decode week number (1 - 7) to Week Name (MON, TUES, WED)
		int week = 2;
		switch( week ) {
		case 1:
			System.out.println("Mon Day");
			break;
		case 2:
			System.out.println("Tues Day");
			break;
		case 3:
			System.out.println("Wednes Day");
			break;
		case 4:
			System.out.println("Thurs Day");
			break;
		case 5:
			System.out.println("Fri Day");
			break;
		case 6:
			System.out.println("satur Day");
			break;
		case 7:
			System.out.println("Sun Day");
			break;
		default: 
			System.out.println("Enter valid week number");
		}
		
		// any alphabet -> vowel or consonant?
		char alphabet = 'a';
		switch (alphabet) {
		case 'a':
		case 'A':	
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
			
		default:
			System.out.println("Consonant");
		}
		
	}
}
