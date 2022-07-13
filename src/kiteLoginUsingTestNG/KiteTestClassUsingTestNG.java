package kiteLoginUsingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class KiteTestClassUsingTestNG 
{
	kiteLoginPage1  page1;
	pinPage2 page2;
	KiteHomePage3 page3;
	WebDriver driver;
	Sheet mySheet;
	@BeforeClass
	public void launchBrowser() throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		ChromeOptions opt= new ChromeOptions();
		//opt.addArguments("--headless");
		//opt.addArguments("--disable-notifications");
		opt.addArguments("incognito");
		driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("Launching browser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//excel sheet path
		File myfile=new File("C:\\velocity - Copy\\sample1.xlsx");
		Sheet mySheet = (Sheet) WorkbookFactory.create(myfile).getSheet("Sheet2");
		//page1= new KiteLoginPage1(driver);
		// = new KitePinPage2(driver);
	//	= new KiteHomePage3(driver);

		
		
	}
  @Test
  public void f() {
  }
}
