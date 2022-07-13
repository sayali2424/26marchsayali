package TestNgAnnotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AnnotationStudy {
  @Test
  public void validateUserID() 
  {
	  Reporter.log("UserID validated",true);
  }
  @Test
  public void validateDashBoard()
  {
	Reporter.log("DashBoard validate",true);  
  }
  @BeforeMethod
  public void enterUIDandPWD()
  {
	  Reporter.log("UID and PWD entred",true);
  }

  @AfterMethod
  public void logout () 
  {
	  Reporter.log("logout success", true);
	  
  }

  @BeforeClass
  public void browserlaunch()
  {
	  Reporter.log("launched browser",true);
  }

  @AfterClass
  public void  closebrowser() 
  {
	  Reporter.log("closed browser",true); 
  }

 
 
}
