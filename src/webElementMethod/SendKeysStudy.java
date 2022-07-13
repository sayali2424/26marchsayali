package webElementMethod;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysStudy {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
	//driver.get("https://vctcpune.com/selenium/practice.html");
	
	//driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("sayali");
		//driver.manage().window().maximize();
		driver.get("https://auth.discoveryplus.in/login");
		driver.findElement(By.xpath("//h2[text()='Sign In Now']"));
		Thread.sleep(5000);
	WebElement getOTP=driver.findElement(By.xpath("//button[text()='Get OTP']"));
	
			System.out.println(getOTP.isEnabled());
			driver.findElement(By.id("mobileNumber")).sendKeys("7038281818");
			Thread.sleep(3000);
			System.out.println(getOTP.isEnabled());
			getOTP.click();
		
	
	
		
		
		
	}
	

}
