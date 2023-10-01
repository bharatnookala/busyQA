package class1;

import java.util.Scanner;

public class P3_3_07_Array_String {
	
		
	
	public static void main(String[] args) {
		//int a = 2;
		/* 1D array
		 */
		int[] ar = {1,2,3,4,5,6,7,8};
		for(int a=0;a<ar.length;a++) {
			System.out.println("The value is:::"+ar[a]);
		}
		
		/* multi-dimension array
		 */
		int[][] ar1 = {{1,2,3},{4,5,6}};
		for(int i =0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("The ith value is::"+i+" jth value is::"+j+" and actualk value is::"+ar1[i][j]);
			}
		}
		
		
		
		/* String
		 * length()
		 * concat()
		 * trim()
		 * charAt()
		 * contains()
		 * equals()
		 * equalsIgnoreCase()
		 * replace()
		 * substring()
		 * toLowerCase()
		 * toUpperCase()
		 */
		String str1 = "busyqa";
		System.out.println("the length of the string is "+str1.length());
		System.out.println("concat the value "+str1.concat(" first class"));
		System.out.println("trim "+str1.trim());
		System.out.println("charAt "+str1.charAt(2));
		System.out.println("contains "+str1.contains("bus"));
		System.out.println("equals "+str1.equals("busyqa"));
		System.out.println("ignorecase "+str1.equalsIgnoreCase("BUSYQA"));
		System.out.println("replace "+str1.replace('q', 'f'));
		System.out.println("substring "+str1.substring(2, 4));
		System.out.println("lowercase "+str1.toLowerCase());
		System.out.println("uppercase "+str1.toUpperCase());
		
		
						
	}

}
