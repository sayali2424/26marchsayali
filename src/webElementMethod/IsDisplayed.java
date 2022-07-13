package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement hide=driver.findElement(By.id("hide-textbox"));
		WebElement show=driver.findElement(By.id("show-textbox"));
		WebElement textbox=driver.findElement(By.name("show-hide"));
		
		
		if(textbox.isDisplayed())
		{
			System.out.println("texbox is already displayed");
		}
		else
		{
			System.out.println("texbox is not displayed");
		}
		Thread.sleep(3000);
		hide.click();
		if(textbox.isDisplayed())
		{
			System.out.println("texbox is already displayed");
		}
		else
		{
			System.out.println("texbox is not displayed");
		}
		
		Thread.sleep(3000);
		show.click();
		if(textbox.isDisplayed())
		{
			System.out.println("texbox is already displayed");
		}
		else
		{
			System.out.println("texbox is not displayed yet");
		}

	}

}
