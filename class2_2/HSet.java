package class2_2;

import java.util.HashSet;

public class HSet {

	public static void main(String[] args) {
		
		HashSet<Integer> h1 = new HashSet<Integer>();
		
		//add the values
		h1.add(1);
		h1.add(2);
		h1.add(2);
		h1.add(3);
		h1.add(4);
		h1.add(5);
		
		int l1 = h1.size();
		
		System.out.println("the hashset1 has:::"+h1);
		
		//remove value
		h1.remove(2);
		System.out.println("the hashset2 has:::"+h1);
		
		//clear
		h1.clear();
		System.out.println("the hashset3 has:::"+h1);
		
		
		
		

	}

}
