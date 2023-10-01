package class1;

import java.util.Scanner;

public class P3_3_09_1_Class_Object_RefVariable {
	
	static String classString = "String in the class";
	
	
	public static void main(String[] args) {
		
		Cars bmw = new Cars();
		Cars benz = new Cars();
		Cars subaru = new Cars();
		
		bmw.drive = "automatic1";
		bmw.seats = 4;
		bmw.wheel = 4;
		bmw.increaseSpeed();
		bmw.decreaseSpeed();
		
		System.out.println(bmw.drive);
		System.out.println(bmw.seats);
		System.out.println(bmw.wheel);
		
		benz.drive = "automatic2";
		benz.seats = 5;
		benz.wheel = 5;
		benz.increaseSpeed();
		benz.decreaseSpeed();
		
		System.out.println(benz.drive);
		System.out.println(benz.seats);
		System.out.println(benz.wheel);
		
		subaru.drive = "automatic3";
		subaru.seats = 6;
		subaru.wheel = 6;
		subaru.increaseSpeed();
		subaru.decreaseSpeed();
		
		System.out.println(subaru.drive);
		System.out.println(subaru.seats);
		System.out.println(subaru.wheel);
		
		P3_3_09_1_Class_Object_RefVariable a1 = new P3_3_09_1_Class_Object_RefVariable();
		
		System.out.println(classString);
		
		
		
		
		
		
	}
	
		
	
	
			

}
