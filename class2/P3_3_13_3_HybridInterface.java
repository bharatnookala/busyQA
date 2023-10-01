package class2;
import class1.P1_HelloWorld;

import java.util.Scanner;

class Benz{
	void print() {
		System.out.println("Benz class");
	}
}

class BMW7 extends Benz implements Car, Bike{
	

	@Override
	public void decreaseSpeed() {
		super.print();
		System.out.println("decreaseSpeed in BMW");
		
	}

	@Override
	public void increaseSpeedBike() {
		System.out.println("increaseSpeedBike in BMW");
		
	}

	@Override
	public void increaseSpeed() {
		System.out.println("increaseSpeed in BMW");
		
	}
	
}


public class P3_3_13_3_HybridInterface{
	public static void main(String[] args) {
		
		String[] val = {"name1","name2"};
		P1_HelloWorld.main(val);
		
		BMW7 c1 = new BMW7();
		c1.print();
		c1.decreaseSpeed();
		c1.increaseSpeed();
		c1.increaseSpeedBike();
		
		
	}
				

}
