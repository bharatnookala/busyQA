package class4_2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_Groups {
	
	
	@Test(groups = {"murali","tim","chirag"})
	public void testMethod1() {
		System.out.println("all 3 groups");
	}
	
	@Test(groups = {"murali"})
	public void testMethod2() {
		System.out.println("murali group");
	}
	
	@Test(groups = {"tim"})
	public void testMethod3() {
		System.out.println("tim group");
	}
	
	@Test(groups = {"chirag"})
	public void testMethod4() {
		System.out.println("chirag group");
	}
  
  
  
  
}
