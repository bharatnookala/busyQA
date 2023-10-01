package class2;

import java.util.Scanner;

public class P3_3_11_1_Overloading2 {
	
	public static void print(int a, int b) {
		int sum = a + b;
		System.out.println("the first function is::::"+sum);
	}
	
	public static void print(double a, double b) {
		double sum = a + b;
		System.out.println("the second function is::::"+sum);
	}
	
	public static void print(float a, float b) {
		float sum = a + b;
		System.out.println("the third function is::::"+sum);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		print(2,3);
		print(3.2d,4.5d);
		print(3.22f,5.66f);
		
		
		
		
		
	}
	
		
	
	
			

}
