package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1stPro {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.findElement(By.xpath("xpath_expression")).sendKeys("hi sayali");
		//types of xpath:
		//xpath by attribute
		//syntax
		//tagname[@attribute name='attribute value']
		//ex.
		driver.findElement(By.xpath("//input[@id=autocomplete]")).sendKeys("hi sayali");
		
		
		
	}

}
