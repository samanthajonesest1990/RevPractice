//this is a comment


//this is a package declaration
//package declarations must be the first line of your class unless it is a comment
package com.revature;

//this is a class declaration
public class Launcher {

	//this is our main method; the entry point of our application
	//the opening line of a method is called a method signature; this is a typical main method signature
	public static void main(String[] args) {
		
		//the code inside the method (curly braces) is called the method body
		//whatever you write in the print statement, will get printed in the console below
		//ctrl + space prints out syso
		System.out.println("Hello World!");
		System.out.println("Hello Samantha!");
		
		//call example method and give it some values
		exampleMethod(4, 5);
		
		//example method will run but we won't get anything back if we don't print it
		System.out.println(exampleMethod(13, 45));
	}
	
	//here is an example method; check notes for method anatomy
	public static int exampleMethod(int a, int b) {
		return a + b;
	}
}
