package class2_2;

import java.util.HashMap;

public class HMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
		
		//add value
		hm1.put("busyQA1", 1);
		hm1.put("busyQA2", 2);
		hm1.put("busyQA3", 3);
		hm1.put("busyQA4", 4);
		hm1.put("busyQA5", 5);
		
		System.out.println("the entry set is::::"+hm1.entrySet());
		
		
		
		

	}

}
