package class4_2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_Parameter {
	
	@Parameters({"browser"})
	@Test
	public void testMethod(String s1) throws InterruptedException {
		System.out.println("testMethod");
		if(s1.equalsIgnoreCase("chrome")) {
			Thread.sleep(1000);
			System.out.println("this is chrome");
		}else if(s1.equalsIgnoreCase("firefox")) {
			Thread.sleep(2000);
			System.out.println("this is firefox");
		}else if(s1.equalsIgnoreCase("safari")) {
			Thread.sleep(3000);
			System.out.println("this is safari");
		}else {
			System.out.println("this is default");
		}
	}
	
 
  
  
  
}
