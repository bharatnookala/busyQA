package class1;

import java.util.Scanner;

public class P3_3_09_2_Class_Object_Method {
	
	
	public static void main(String[] args) {
		
		Cars bmw = new Cars();
		
		
		bmw.drive = "automatic1";
		bmw.seats = 4;
		bmw.assignwheel(5);
		bmw.increaseSpeed();
		bmw.decreaseSpeed();
		
		System.out.println(bmw.drive);
		System.out.println(bmw.seats);
		System.out.println(bmw.wheel);
		
		
		
		
	}
	
		
	
	
			

}
