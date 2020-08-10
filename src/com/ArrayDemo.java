package com;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Array ? - 
		
		// six subject -> int s1, s2, .. s6;
		// App - 1000 -> 
		
		//syntax: 
		//	datatype arrayName [] = new datatype [size];
		//  index: 0 - (size-1)
		
		//int marks[] = new int [6];
//		Scanner in = new Scanner(System.in);
//		//input accept
//		System.out.println("Enter six subject marks");
//		for(int i = 0; i < 6; i++) {
//			marks[i] = in.nextInt();
//		}
//		
//		//print
//		for(int i = 0; i < 6; i++) {
//			System.out.println(marks[i]);
//		}
		
		//1. Fixed number elements
		//2. Fixed data type
		
		//Array types
		/* 
		 * 1. Single Dimensional - > one subscript []
		 * 2. Multi Dimensional	- > more than one subscript [][] - rows and columns    
		*/
		
//		int matrix [][] = {
//				{ 2, 4 },
//				{ 7, 9 }
//		};
//		
//		System.out.println(matrix[1][0]); // 7
		
		int matrix[][] = new int[2][2];
		
		Scanner in = new Scanner(System.in);
		//input accept
		System.out.println("Enter matrix elements");
		for(int i = 0; i < 2; i++) { // i = 0, 1, 2
			for(int j = 0; j < 2; j++) { // j = 0, 1, 2
				matrix[i][j] = in.nextInt();
			}
		}
		
		//print
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		//Single dimensional array
		// 1. Accept 10 students details and perform calculations - classes and objects
		// 2. accept multiple numbers and print in reverse order 
		//		ex: [2, 5, 3, 8,2]
		//			2, 8, 3, 5, 2	
		// 3. accept array elements and print sum of all elements
		// 4. Accept array elements and print sorting order (sorting algorithms)
		// 5. Accept array elements and find the element exists in the given array ( Search algorithm)
		//M dimensional array
		// 6. Accept two matrices and print sum and multiplication of two matrices
		
		// 6 - 1, 2, 3 = 6
		
		//foreach - looping through list elements (arrays, collection..)
		int numbers[] = { 10, -20, 40 , -50, 70, 40, 60, 70 };
		for(int i = 0; i < numbers.length; i++) {
			//code 10 line
			// condition 2dnline - continue
			//8 lines
		}
		
		//foreach syntax
		// for (datatype variableName : arrayName / collectionName ) {
		//	//code
		// }
		
		//break, continue
		
		int key = 20;
		for(int number : numbers) {
			if(number == key) {
				System.out.println(number + " is found");
				break;
			}
		}
		
		// 1 	1	1	1
		// 2		2	2	2
		// 3		3	3	3
		
		
		// 1 
		// 2		2 
		// 3 	3	3
		// 4		4	4	4
		// 5		5	5	5	5
		// 6		6	6	6	6	6
		
		
		for ( int i = 1; i <= 6; i++) {
			for(int j = 1; j <= i; j++){
				System.out.print(i);
			}
			System.out.print("\n");
		}
		
		// 	1
		//	2 	3
		//	3	4	5
		//	4	5	6	7
		
		for ( int i = 1; i <= 4; i++) { // i = 1, 2
			for(int j = 0; j < i; j++) {
				System.out.print(i+j);
			}
			System.out.print("\n");
		}
		
		//					1
		//				2	1
		//			3	2	1
		//		4	3	2	1
		//	5	4	3	2	1
		
		for ( int i = 1; i <= 5; i++) { //  i = 1, 2
			for(int s = 1; s <= (5-i); s++) { // s = 1, 2, 3
				System.out.print(" ");
			}
			for(int j = i; j >= 1; j--) { //j = 2, 1, 0
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}
