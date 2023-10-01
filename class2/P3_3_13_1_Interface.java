package class2;

import java.util.Scanner;

class BMW implements Car{

	@Override
	public void decreaseSpeed() {
		System.out.println("decreaseSpeed in BMW");
		
	}

	@Override
	public void increaseSpeed() {
		System.out.println("increaseSpeed in BMW");
		
	}
	
}


public class P3_3_13_1_Interface{
	public static void main(String[] args) {
		
		BMW c1 = new BMW();
		c1.increaseSpeed();
		c1.decreaseSpeed();
		
		
		
	}
				

}
