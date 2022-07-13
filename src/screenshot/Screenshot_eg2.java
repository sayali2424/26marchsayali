package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot_eg2 {

	public static void main(String[] args) throws InterruptedException, IOException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		//1st step
	 File source =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 
	 System.out.println(source);
	 //step 2
	String str = RandomString.make(3);//random string this will avoid overrwriting of file
	//step 3
	 File dest=new File("C:\\Screenshots\\myscreenshot"+str+".png");
	// step4
	 FileHandler.copy(source, dest);
	

	}

}
