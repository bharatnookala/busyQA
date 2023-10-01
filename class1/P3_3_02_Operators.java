package class1;

import java.util.Scanner;

public class P3_3_02_Operators {
	
	public static void main(String[] args) {
		int intVar1 = 2;
		int intVar2 = 3;
		
		/* Arithmetic
		 * Addition: +
		 */
		int add = intVar1 + intVar2;
		System.out.println("addition:::"+add);
		
		
		/* Arithmetic
		 * Subtraction: -
		 */
		int sub = intVar1 - intVar2;
		System.out.println("subtraction:::"+sub);
		
		/* Arithmetic
		 * Multiplication: *
		 */
		
		int mult = intVar1 * intVar2;
		System.out.println("multiplication::"+mult);
		
		/* Arithmetic
		 * Division: /
		 */
		
		int div = intVar1/intVar2;
		System.out.println("division::"+div);
		
		/* Arithmetic
		 * Modulus: %
		 */
		
		int mod = intVar1 % intVar2;
		System.out.println("Mod:::"+mod);
		
		/* Arithmetic
		 * Increment: ++
		 */
		
		int incrVar1 = intVar1++;
		int incrVar2 = ++intVar2;
		System.out.println("incrVar1:::"+incrVar1);
		System.out.println("incrVar2:::"+incrVar2);
		
		/* Arithmetic
		 * Decrement: --
		 */
		
		int decVar1 = intVar1--;
		int decVar2 = --intVar2;
		System.out.println("decVar1:::"+decVar1);
		System.out.println("decVar2:::"+decVar2);
		
		/* Logical
		 * AND: &&
		 */
		
		boolean andVar = (intVar1 <2) && (intVar2 >3);
		System.out.println("andVar:::"+andVar);
		
		/* Logical
		 * OR: ||
		 */
		boolean orVar = (intVar1 <2) || (intVar2 >3);
		System.out.println("orVar:::"+orVar);
		
		/* Logical
		 * NOT: !
		 */
		
		System.out.println("notvar:::"+!andVar);
		
		
		/* Comparison
		 * Equal to: ==
		 */
		
		System.out.println("equal:::"+(intVar1 == 2));
		
		/* Comparison
		 * Not equal to: !=
		 */
		
		System.out.println("not equal:::"+(intVar1 != 2));
		
		/* Comparison
		 * Less than: <
		 */
		
		System.out.println("less than:::"+(intVar1 < 2));
		
		/* Comparison
		 * Less than or equal: <=
		 */
		
		System.out.println("less equal than:::"+(intVar1 <= 2));
		
		/* Comparison
		 * Greater than: >
		 */
		
		System.out.println("greater than:::"+(intVar1 > 2));
		
		/* Comparison
		 * Greater than or equal: >=
		 */
		
		System.out.println("greater than:::"+(intVar1 >= 2));
		
		/* String
		 * concatenate: +
		 */
		
		String strVar1 = "string1";
		String strVar2 = "string2";
		String strVar3 = strVar1 + strVar2;
		System.out.println("concat::::"+strVar3);
		
	}

}
