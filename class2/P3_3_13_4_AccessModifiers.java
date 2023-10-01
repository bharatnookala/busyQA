package class2;

import java.util.Scanner;


class privateMthod {
	private int a = 2;
	public int b = 3;
	protected int c = 4;
	//setter
	public void setA(int val) {
		this.a = val;
	}
	//getter
	public int getA() {
		return this.a;
	}
}

public class P3_3_13_4_AccessModifiers{
	public static void main(String[] args) {
		
		privateMthod p1 = new privateMthod();
		p1.setA(3);
		System.out.println("the value is::::"+p1.getA());
		
		
		
	}
				

}
