package TestNgstudy1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass1  {
  @Test
  public void Mymethod1() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(4000);
		System.out.println("hi this is method running");
		Reporter.log("hi this is method running ");
		Reporter.log("hi this is method running true",true);
		
  }
}
