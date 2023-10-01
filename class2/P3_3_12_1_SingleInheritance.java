package class2;

import java.util.Scanner;

class Cars1{
	void increaseSpeed() {
		System.out.println("increaseSpeed in cars1");
	}
}

class BMW1 extends Cars1{
	void increaseSpeed1() {
		System.out.println("increaseSpeed in cars2");
	}
}



public class P3_3_12_1_SingleInheritance {
	public static void main(String[] args) {
		BMW1 c1 = new BMW1();
		c1.increaseSpeed();//super class
		c1.increaseSpeed1();//child class
		
		
		
	}
				

}
