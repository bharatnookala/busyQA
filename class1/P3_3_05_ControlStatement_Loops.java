package class1;

import java.util.Scanner;

public class P3_3_05_ControlStatement_Loops {
	
	public static void ifelse(int a, int b) {
		if(a > b) {
			System.out.println("a is greater than b");
		}
		else if (b > a){
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("no condition matches!!!");
		}
		
	}
	
	
	public static void switchcase(int a) {
		switch(a) {
		case 1:
			System.out.println("number is 1");
			break;
		case 2:
			System.out.println("number is 2");
			break;
		case 3:
			System.out.println("number is 3");
			break;
		default:
			System.out.println("not matching with any number");
			break;
		}
		
	}	

	public static void whileloop(int a) {
		
		while(a > 0) {
			System.out.println("The number is:::"+a);
			a--;
		}
		System.out.println("while loop exited");
		
	}

	
	public static void dowhileloop(int a) {
		do {
			System.out.println("The number is:::"+a);
			a--;
		}while(a>0);
		System.out.println("do while loop exited");
		
	}
	
	public static void forloop(int a) {
		for(int b=0;b<a;b++) {
			System.out.println("the value of b is:::"+b);
			System.out.println("the value of a is:::"+a);
		}
		
	}

	public static void breakexample() {
		
	}

	
	public static void continueexample(int a) {
		
		for(int b=0;b<a;b++) {
			
			if(b==5) {
				
				continue;
			}
			System.out.println("the value of b is:::"+b);
			System.out.println("the value of a is:::"+a);
		}
		
		
		
	}

	public static void scannerexample() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("please input the number");
		int a = in.nextInt();
		System.out.println("the number is:::"+a);
		
	}
	
	
	public static void main(String[] args) {
		/* if......else
		 */
		
		int intVar1 = 2;
		int intVar2 = 3;
		//ifelse(intVar1,intVar2);
		
		
		
		
		/* switch.....case
		 */
		
		//switchcase(intVar1);
		//switchcase(intVar2);
		//switchcase(6);
		
		
		/* while
		 */
		
		//whileloop(10);
		
		/* do.....while
		 */
		//dowhileloop(10);
		
		/* for
		 */
		//forloop(5);
		
		
		/* break
		 */
		
		
		/* continue
		 */
		//continueexample(10);
		
		/* scanner
		 */
		
		scannerexample();
				
	}

}
