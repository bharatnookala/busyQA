package class2;

import java.util.Scanner;


class Cars3{
	void increaseSpeed() {
		System.out.println("increaseSpeed in Cars3");
	}
}

class BMW3 extends Cars3{
	void increaseSpeed1() {
		System.out.println("increaseSpeed in BMW3");
	}
}

class Tesla3 extends Cars3{
	void increaseSpeed2() {
		System.out.println("increaseSpeed in Tesla3");
	}
}


public class P3_3_12_3_HierarchialInheritance {
	public static void main(String[] args) {
		
		Cars3 c1 = new Cars3();
		c1.increaseSpeed();
		BMW3 c2 = new BMW3();
		c2.increaseSpeed();
		c2.increaseSpeed1();
		Tesla3 c3 = new Tesla3();
		c3.increaseSpeed();
		c3.increaseSpeed2();
		
		
		
		
	}
				

}
