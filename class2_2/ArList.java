package class2_2;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArList {

	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>(); 
		
		//add a value
		a1.add("busyQA1");
		a1.add("busyQA2");
		a1.add("busyQA3");
		a1.add("busyQA4");
		
		
		//get a value
		int length = a1.size();
		for(int a = 0; a<length;a++) {
			System.out.println(a1.get(a));
		}
		
		
		
		//remove a value
		a1.remove(0);
		System.out.println("after removal");
		
		int length2 = a1.size();
		for(int a = 0; a<length2;a++) {
			System.out.println(a1.get(a));
		}
		
		
		//clear
		a1.clear();
		int length3 = a1.size();
		System.out.println("the length is:::::"+length3);
		
		
		

	}

}
