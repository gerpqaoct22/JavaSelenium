package oct22.day8_TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
		public static ChromeDriver driver;
		
		@BeforeMethod
		public void preCondition()
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}

		@AfterMethod
		public void postCondition()
		{
			driver.close();
		}
	
}
