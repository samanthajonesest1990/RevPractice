package com.revature;


public class Launcher {
	
	//to autogenerate a main method; main and ctrl + space
	
	public static void main(String[] args) {
		
		//syso ctrl + space
		
		System.out.println("====common primitives====");
		
		//int is the most common integer type primitive; others are byte, short, and long
		
		
		int i = 200000;
		
		//we use the plus sign to concatenate
		System.out.println("The value of my int is:" + i);
		
		//chars are 2 bytes and written in single quotes; represent single character
		char c= 'a';
		char c2 = 67;
		char c3 = '$';
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c3);
		
		//doubles are the most common decimal
		
		double d=2.2;
		System.out.println("The value of my double is: " + d);
		
		double d2=2;
		System.out.println("The value of my other double is: " + d2);
		
		//making an int value a double will automatically assign a decomal place
		
		//booleans are true or false
		boolean bool= true;
		boolean bool2= false;
		
		System.out.println(bool);
		System.out.println(bool2);
		
		System.out.println("====arithmetic operators====");
		
		int sum= 5 + 5;
		int difference= 20 - 10;
		int product= 5 * 2;
		int quotient= 100/10;
		int remainder= 30 % 20;
		//these should all equal 10
		
		//you can do mathematical operations within print statements using numbers or variables
		System.out.println(5+5);
		System.out.println(sum+difference);
		System.out.println(sum*difference/quotient*remainder);
		
		//PEMDAS works as usual
		System.out.println("====increment/decrement====");
		
		//we use ++ to increase by 1 and -- to decrease by 1
		
		int funnyNumber = 24;
		System.out.println("funnyNumber is equal to: " + funnyNumber);
		
		funnyNumber++; //this will increase the value of our variable by 1
		System.out.println("funnyNumber is equal to: " + funnyNumber);
		
		funnyNumber--;
		System.out.println("funnyNumber is equal to: " + funnyNumber);
	}

	
}
