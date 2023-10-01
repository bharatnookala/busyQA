package class2;

import java.util.Scanner;



public class P3_3_13_5_UncheckedException{
	
	public static void divide(int a, int b) {
		int val = a/b;
		System.out.println("the value is:::"+val);
	}
	
	public static void nullpointr(String a) {
		String str=null;
		System.out.println("the value is:::"+str.length());
	}
	
	
	public static void main(String[] args) {
		
		
		try {
			//divide(4,0);
			nullpointr("busyQA");
			
		}catch(ArithmeticException e) {
			System.out.println("there is an ArithmeticException");
		}catch(NullPointerException e) {
			System.out.println("there is an NullPointerException");
		}catch(Exception e) {
			System.out.println("there is an Exception");
		}finally {
			System.out.println("finally block");
		}
		
		
		
		
		
		
	}
				

}
