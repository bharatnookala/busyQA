package class2;

import java.util.Scanner;

public class P3_3_11_2_this_keyword {
	
	public static void main(String[] args) {
		Cars bmw = new Cars();
		bmw.setBrandName("BMW");
		//bmw.setSpeed(30);
		//bmw.setWheels(4);
		
		Cars.wheels = 4;
		Cars.increaseSpeed("BMW");
		
		bmw.getBrandName();
		
		
	}
	
				

}
