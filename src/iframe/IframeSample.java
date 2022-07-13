package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeSample {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//switch selenium focus from main page to frame
		driver.switchTo().frame("iframe-name");
		Thread.sleep(100);
		
		driver.findElement(By.xpath("(//a[text()='About Us'])[1]")).click();
		//parentframe();default content();
		
		driver.switchTo().defaultContent();//to switch focus to parent frame
		
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();
		
	}

}
