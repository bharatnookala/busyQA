package class2;

import java.util.Scanner;

class vehicle implements Bike, Car{

	@Override
	public void decreaseSpeed() {
		System.out.println("decreaseSpeed in Car");
		
	}

	@Override
	public void increaseSpeed() {
		System.out.println("increaseSpeed in Car");
		
	}

	@Override
	public void increaseSpeedBike() {
		System.out.println("increaseSpeed in Bike");
		
	}
	
}


public class P3_3_13_2_MultiInterface{
	public static void main(String[] args) {
		
		
		vehicle v1 = new vehicle();
		v1.increaseSpeed();
		v1.increaseSpeedBike();
		v1.decreaseSpeed();
		
	}
				

}
