package abishek2;

import java.util.Scanner;

// 
class Scannerstring {
	// entry point
	public static void main(String args[]) {
		//variable,type of variable?
		//variable vs datatype ?
		//list all the datatype ?
		String str = null, rev = "";
		//
		Scanner sc = new Scanner(System.in);
		//
		System.out.println("Enter a string:\n");
		System.out.println(str);
		str = sc.nextLine();
		System.out.println(str);
		int length = str.length();
		System.out.println("length of the str given by user, "+length);
		//loop 
		//for loop initialization, loop condition, loop increment/decrement 
		for (int i = length - 1; i >= 0; i--) {
			System.out.println("character of string index is "+i+" character is "+str.charAt(i));
			rev = rev + str.charAt(i);
			System.out.println("index is "+i+" rev value is "+rev);
		}
			

		if (str.equals(rev))
			System.out.println(str + " is a palindrome");
		else
			System.out.println(str + " is not a palindrome");
		sc.close();
	}
}