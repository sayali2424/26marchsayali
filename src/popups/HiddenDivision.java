package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		//step1=click on web element
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//step2=click on ok
		driver.findElement(By.id("alertButton")).click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		//step 3=
		Thread.sleep(1000);

		driver.findElement(By.id("timeAlertButton")).click();
	
	}
}
