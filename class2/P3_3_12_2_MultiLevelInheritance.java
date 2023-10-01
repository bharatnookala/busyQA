package class2;

import java.util.Scanner;

class Cars2{
	void increaseSpeed() {
		System.out.println("increaseSpeed in Cars2");
	}
}

class BMW2 extends Cars2{
	void increaseSpeed1() {
		System.out.println("increaseSpeed in BMW2");
	}
}

class Tesla2 extends BMW2{
	void increaseSpeed2() {
		System.out.println("increaseSpeed in Tesla3");
	}
}


public class P3_3_12_2_MultiLevelInheritance {
	public static void main(String[] args) {
		
		Cars2 c1 = new Cars2();
		c1.increaseSpeed();
		BMW2 c2 = new BMW2();
		c2.increaseSpeed();
		c2.increaseSpeed1();
		Tesla2 c3 = new Tesla2();
		c3.increaseSpeed();
		c3.increaseSpeed1();
		c3.increaseSpeed2();
		
		
		
	}
				

}
