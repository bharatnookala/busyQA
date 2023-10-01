package class1;

import java.util.Scanner;

public class P3_3_01_Variables_DT {
	
	public static void main(String[] args) {
		/* Byte
		 * size: 1 byte
		 * range: -128 to 127(2^(8-1))
		 * default: 0
		 */
		
		byte byteVar1 = -93;
		byte byteVar2 = 93;
		
		System.out.println("the byteVar1 value is::::"+byteVar1);
		System.out.println("the byteVar2 value is::::"+byteVar2);
		
		/* Short
		 * size: 2 bytes = 2*8=16 bits
		 * range: -32768 to 32767(2^(16-1))
		 * default: 0
		 */
		
		short shortVar1 = -32768;
		short shortVar2 = 32767;
		
		System.out.println("The shortvar1 value is:::"+shortVar1);
		System.out.println("The shortvar2 value is:::"+shortVar2);
		
		/* int
		 * size: 4 bytes = 4*8=32
		 * range: -2147483648 to 2147483647(2^(32-1))
		 * default: 0
		 */
		
		int intVar1 = -2147483648;
		int intVar2 = 2147483647;
		
		System.out.println("The intVar1 value is:::"+intVar1);
		System.out.println("The intVar2 value is:::"+intVar2);
		
		/* long
		 * size: 8 bytes
		 * range: (2^(32-1)) to ((2^(32-1)) - 1)
		 * default: 0
		 */
		
		long longVar1 = -2147483648;
		long longVar2 = 2147483647;
		
		System.out.println("The longVar1 value is::::"+longVar1);
		System.out.println("The longVar2 value is::::"+longVar2);
		
		/* float
		 * size: 4 bytes
		 * range: 1.4E-45 to 3.4028235E38
		 * default: 0.0f
		 */
		
		float floatVar1 = 1.4142f;
		float floatVar2 = -1.732f;
		System.out.println("The float value floatVar1 is::::"+floatVar1);
		System.out.println("The float value floatVar2 is::::"+floatVar2);
		
		/* double
		 * size: 8 bytes
		 * range: 4.9E-324 to 1.7976931348623157E308
		 * default: 0.0d
		 */
		
		double doubleVar1 = 1.4142d;
		double doubleVar2 = -1.732d;
		System.out.println("The double value doubleVar1 is::::"+doubleVar1);
		System.out.println("The double value doubleVar2 is::::"+doubleVar2);
		
		/* char
		 * size: 2 bytes
		 * default: 0
		 */
		
		char charVar1 = 'a';
		System.out.println("The character value is::::"+charVar1);
		
		/* boolean
		 * size: 1 byte
		 * default: false
		 */
		
		boolean boolVar1 = true;
		boolean boolVar2 = false;
		
		System.out.println("The boolean value is::::"+boolVar1);
		System.out.println("The boolean value is::::"+boolVar2);
		
		
		
		short defaultShort = 0;
		byte defaultByte = 0;
		long defaultLong = 0;
		float defaultFloat = 0;
		double defaultDouble = 0;
		char defaultChar = 0;
		int defaultInt = 0;
		boolean defaultBool = false;
		
		
		
		System.out.println("defaultShort:::"+defaultBool);
		
		
	}

}
