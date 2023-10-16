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

public class TestNG_Parameter2 {
  @Test
  public void method1() {
	  System.out.println("test method1");
  }
  
  @Parameters({"param1","param2"})
  @Test
  public void method2(String s1, String s2) {
	  System.out.println("test method2 with string "+s1+" and the second parameter is "+s2);
  }
  
  
  
}
