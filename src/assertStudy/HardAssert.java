package assertStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssert {
  @Test
  public void MyMethod() 
  {//AssertEquals
	  String a="Pune";
	  String b="Pune";
	  Assert.assertEquals(a,b,"a and b is not matching so Tc is failed");
	  Reporter.log("a and b is matching so Tc is failed");
  }
  @Test
  public void mymethod()
  {
  
	 // AssretNotEquals
	  String c="Pune";
	  String d="Kolhapur";
	  Assert.assertNotEquals(c,d,"a and b is not matching so Tc is failed");
	  Reporter.log("c and d is not equal so Tc is passed",true);
  }
}
