package oct22.day10_TestNGAndCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAssertion {
  
	@Test
	  public void orangeHRMlogin() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRMHomePage";
		
		
		/*if (actualTitle.equals(expectedTitle))
		{
			System.out.println("ActualTitle is matched");
		}
		else
			System.out.println("ActualTitle is not matched");
	  }*/
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("ActualTitle is matched");
		System.out.println("End of the Program");
	}
}
