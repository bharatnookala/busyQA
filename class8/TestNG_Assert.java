package class8;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Assert {
  @Test
  public void int_func() {
	  SoftAssert sa = new SoftAssert();
	  int a = 2;
	  sa.assertEquals(a, 5);
	  int b = 3;
	  sa.assertEquals(a, 3);
	  Assert.assertEquals(a+b, 5);
	  System.out.println("next step");
  }
  
  @Test
  public void char_func() {
	  SoftAssert sa = new SoftAssert();
	  char a = 'a';
	  sa.assertEquals(a, 'b');
	  sa.assertEquals(a, 'c');
	  sa.assertEquals(a, 'd');
	  sa.assertEquals(a, 'a');
	  sa.assertAll();
  }
  
  @Test
  public void string_func() {
	  String str = "value";
	  Assert.assertEquals(str, "value");
  }
  
  @Test
  public void bool_func() {
	  boolean value = true;
	  Assert.assertEquals(value, true);
  }
}
