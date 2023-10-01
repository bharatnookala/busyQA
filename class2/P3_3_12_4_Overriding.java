package class2;

import java.util.Scanner;

class Cars4{
	int wheels = 4;
	Cars4(){
		System.out.println("constructor in Cars4");
	}
	void increaseSpeed() {
		System.out.println("increaseSpeed in Cars4");
	}
}

class BMW4 extends Cars4{
	BMW4(){
		System.out.println("constructor in BMW4");
	}
	void increaseSpeed() {
		System.out.println("increaseSpeed in BMW4");
		super.increaseSpeed();
		System.out.println(super.wheels);
	}
}

class Tesla4 extends Cars4{
	void increaseSpeed() {
		System.out.println("increaseSpeed in Tesla4");
	}
}


public class P3_3_12_4_Overriding {
	public static void main(String[] args) {
		Cars4 c1 = new Cars4();
		c1.increaseSpeed();
		BMW4 c2 = new BMW4();
		c2.increaseSpeed();
		
		
	}
				

}
