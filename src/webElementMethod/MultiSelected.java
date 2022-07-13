package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		Thread.sleep(4000);
		WebElement MultiSelect=driver.findElement(By.name("cars"));
		Select s=new Select(MultiSelect);
		
		//isMultiple();
		System.out.println(s.isMultiple());
		s.selectByVisibleText("Volvo");
		Thread.sleep(4000);
		
		s.selectByValue("saab");
		Thread.sleep(4000);
		
		s.deselectByIndex(2);
		Thread.sleep(4000);
	}

}
