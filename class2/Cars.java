package class2;

public class Cars {
	
	static int wheels;
	String brandName;
	int speed;

	
	public void getBrandName() {
		System.out.println(this.brandName);
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public static void increaseSpeed(String a) {
		System.out.println("increaseSpeed");
	}
	
	public static void decreaseSpeed(String a) {
		System.out.println("decreaseSpeed");
	}
	public void getSpeed() {
		System.out.println(this.speed);
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	

}
