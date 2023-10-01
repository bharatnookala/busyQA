package class2;

import java.util.Scanner;

public class P3_3_11_1_Overloading {
	
	public static void print(String a) {
		System.out.println("the string is::::"+a);
	}
	
	public static void print(String a, String b) {
		System.out.println("the string is::::"+a+" the next string is:::"+b);
	}
	
	public static void print(String a, String b, String c) {
		System.out.println("the string is::::"+a+" the next string is:::"+b+"third string is:::"+c);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		print("busyQA1");
		print("busyQA1","busyQA2");
		print("busyQA1","busyQA2","busyQA3");
		
		
		
		
		
	}
	
		
	
	
			

}
