package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		//1.insert first name
		Thread.sleep(4000);
		driver.findElement(By.name("firstname")).sendKeys("Sayali");
		
		//2.insert surname
		Thread.sleep(4000);
		driver.findElement(By.name("lastname")).sendKeys("khot");
		
		//3.insert email address
		Thread.sleep(4000);
		driver.findElement(By.name("reg_email__")).sendKeys("sayalikhot24@gmail.com");
		
		//4.Re-enter email address
		Thread.sleep(4000);
		
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sayalikhot24@gmail.com");
		
		//5.enter new password
		Thread.sleep(4000);
		driver.findElement(By.id("password_step_input")).sendKeys("====");
		
		//6.select day
		Thread.sleep(4000);
		WebElement Day = driver.findElement(By.id("day"));
		Select s=new Select(Day);
		s.selectByVisibleText("30");
		
		//7.select Month
		Thread.sleep(4000);
		WebElement Month= driver.findElement(By.id("month"));
		Select m=new Select(Month);
		m.selectByVisibleText("Apr");
		
		//8.select year
		Thread.sleep(4000);
		WebElement year= driver.findElement(By.name("birthday_year"));
		Select y=new Select(year);
		y.selectByValue("1993");
		
		//9.select gender
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		//10.click sign up button
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		
		
	} 

}
