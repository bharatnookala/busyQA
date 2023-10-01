package class1;

public class Cars {
	
	int wheel;
	String drive;
	int seats;
	
	public Cars() {
		
	}
	


	public Cars(int a, String b, int c) {
		wheel = a;
		drive = b;
		seats = c;
	}
	
	static void stMethod() {
		System.out.println("this is static method");
	}
	
	void increaseSpeed() {
		System.out.println("increasing the speed");
	}
	
	void decreaseSpeed() {
		System.out.println("decreasing the speed");
	}
	
	void assignwheel(int a) {
		wheel = a;
	}
	
	

	
}
