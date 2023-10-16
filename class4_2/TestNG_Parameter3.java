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

public class TestNG_Parameter3 {
  @Test
  public void method1() {
	  System.out.println("test method1");
  }
  
  @Parameters("param1")
  @Test
  public void method2(String s1) {
	  if(s1.equalsIgnoreCase("value1")) {
		  System.out.println("first if condition");
	  }else if(s1.equalsIgnoreCase("value2")) {
		  System.out.println("second if condition");
	  }else {
		  System.out.println("nothing");
	  }
  }
  
  
  
}
