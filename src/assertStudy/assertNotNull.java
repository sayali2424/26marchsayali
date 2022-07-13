package assertStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertNotNull {
  @Test
  public void MyMethod()
  {
	  String b="abc";
	  Assert.assertNotNull(b, "value is null Tc is failed");
	  Reporter.log("value is not null Tc is pass",true);
  }
  @Test
  public void Mymethod1()
  {String a=null;
  Assert.assertNull(a, "value is null Tc is failed");
  Reporter.log("value is not null Tc is pass",true);
	  
  }
  @Test
  public void multipleVerification()
  {
	  //assert.fail();
	  String a= "xyz";
	  String b="abc";
	  Assert.assertEquals(a, b,"value is not matching Tc fail");
	  Assert.assertNotNull(a,"value is not null Tc is fail"  );
  }
}
