package TestNgKeyword;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountUse {
  
	  @Test(invocationCount=3)
	  public void helloWord() 
	  {
		  Reporter.log("hello",true);
	  }
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		  Reporter.log("hi",true);
	  }

	  @AfterMethod
	  public void afterMethod()
	  { Reporter.log("how are u",true);
	  }

	
  }

