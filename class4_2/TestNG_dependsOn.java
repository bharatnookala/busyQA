package class4_2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_dependsOn {
	@Test(dependsOnMethods= {"method2"})
	  public void method1() {
		  System.out.println("method1");
	  }
	  @Test(dependsOnMethods= {"method3"})
	  public void method2() {
		  System.out.println("method2");
	  }
	  @Test(dependsOnMethods= {"method4"})
	  public void method3() {
		  System.out.println("method3");
	  }
	  @Test(dependsOnMethods= {"method5"})
	  public void method4() {
		  System.out.println("method4");
	  }
	  @Test
	  public void method5() {
		  System.out.println("method5");
	  }
    
}
