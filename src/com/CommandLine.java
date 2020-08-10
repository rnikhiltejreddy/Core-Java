package com;

public class CommandLine {
	public static void main(String[] args) {
		/*String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		System.out.println("name1 value is::" + name1);
		System.out.println("name2 value is::" + name2);
		System.out.println("name3 value is::" + name3);
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}*/
		
		// accept two number and print sum
		int a, b;
		a = Integer.parseInt(args[0]); //variable = value;
		b = Integer.parseInt(args[1]);
		System.out.println("sum of a and b is:"+ (a+b));
		
		
	}
}

//java CommandLine 10 20


//args[10, 20] - length -2
//		0  1

//"10" - > int - possible
//"abc" -> int - not possible

//Class type -> primitive type - Wrapper Classess

//Program -> task -> output

//Wrapper Classes:
//1. Integer - int = Integer.parseInt(string)
//2. Float - float = Float.parseFloat(string)
//3. Double - double = Double.parseDouble(String) 
//4. Short - short = Short.parseShort(String)
//5. Long - long = Long.parseLong(string)


// parseXxx(string) -  