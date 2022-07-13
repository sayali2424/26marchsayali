package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) 
	{ 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement option1=driver.findElement(By.name("checkBoxOption1"));
		//option1=click();
		if(option1.isSelected())
		{
			System.out.println("option 1 is allready selected");
			
		}
		else
		{
			option1.click();
			System.out.println("option 1 is now selected");
		}
		

	}


}
