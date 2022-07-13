package webdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//1)get method
//		driver.get("https://vctcpune.com/selenium/practice.html");
//		
//		//2)close ()
//		driver.close();
//		
//		//3)quit()
//		
//		driver.quit();
//		
//		//4)maximize/minimize()
//		driver.manage().window().maximize();
//		
//		driver.manage().window().minimize();
//		
//		//5)naviget
//	//	driver.get("https://vctcpune.com/selenium/practice.html");
//		Thread.sleep(100);
		driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(400);
		
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().forward();
		Thread.sleep(400);
		driver.navigate().refresh();
		Thread.sleep(400);
		
		//6)get title 
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(400);
		
		String Title=driver.getTitle();
		System.out.println("Title is"+Title);
		
		//7)get current url
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(400);
		
		//System.out.println(driver.getCurrentUrl());
		String url=driver.getCurrentUrl();
		System.out.println("Url is"+url);
		
	}

}
