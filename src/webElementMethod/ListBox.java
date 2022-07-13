package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(4000);
		//1.Identify list box to be handled and store it in reference variable
		
		WebElement listbox = driver.findElement(By.id("dropdown-class-example"));
		
		//2create an object of select class which will accept WebElement as argument
		Select s=new Select(listbox);
		//3.By using one of the select class method we can select values from list box like
		s.selectByVisibleText("option3");
		Thread.sleep(4000);
		
		s.selectByValue("option2");
		Thread.sleep(4000);
		
		s.deselectByIndex(1);
		
		

	}

}
