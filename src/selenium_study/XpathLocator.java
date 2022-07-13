package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//xpath by attribute
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).click();
		//2.xpath by text
		//tagname[text()='textvalue']
		
		//3.xpath by contains
		//1)contains with text()
		//tagname[contains(text(),='textvalue')]
		//2)contains with attribute
		//	//tagname[contains(@attribute name=attribute value),'textvalue']
		
		//4.xpath by index
		//(//tagname[@attribute name='attribute value'])[2]
		
		//5.absolute relative xpath
		
		
		
		


	}

}
