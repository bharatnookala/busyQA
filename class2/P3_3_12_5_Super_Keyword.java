package class2;

import java.util.Scanner;

class Car5{
	Car5(){
		System.out.println("constructor");
	}
	int a = 5;
	void drive() {
		System.out.println("Drive car safely");
	}
}

class Sedan5 extends Car5{
	Sedan5(){
		super();
	}
	void drive() {
		super.drive();
		System.out.println(super.a);
		System.out.println("Drive sedan safely");
		
	}
}

class SUV5 extends Sedan5 {
	void drive() {
		System.out.println("Drive SUV safely");
	}
}


public class P3_3_12_5_Super_Keyword {
	public static void main(String[] args) {
		Car5 c1 = new Car5();
		c1.drive();
		Sedan5 c2 = new Sedan5();
		c2.drive();
		SUV5 c3 = new SUV5();
		c3.drive();
		
	}
				

}
