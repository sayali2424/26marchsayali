package assertStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertTrue {
 

@Test
  public void MyMethdo()
  {
	  boolean c=true;
	 boolean d=false;
	  Assert.assertTrue(c," c is passed Tc is passed");
	  Reporter.log("d   is  so Tc is passed",true);
  }
}
