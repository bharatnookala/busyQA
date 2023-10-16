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

public class TestNG_DataProvider2 {
	
	@DataProvider(name="busyQA")
	String[][] details(){
		System.out.println("in the details()");
		String[][] a1= {{"murali","busyqa1"},{"tim","busyqa2"},{"chirag","busyqa3"}};
		return a1;
	}
	
  
  
  
  
}
