package oct22.day3_SeleniumIntro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelectDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Step1: Identify the Select drop down webelement by locator
		WebElement countryDropDown = driver.findElement(By.name("country"));
		
		//Step2: Create Object for Select Class
		Select country = new Select(countryDropDown);
		
		//select the drop value by 3 available methods
		//1.Select by index		
		country.selectByIndex(8);
		
		//2.Select by Value
		country.selectByValue("BOSNIA AND HERZEGOVINA");
		
		//3.Select by visibleText
		country.selectByVisibleText("KOREA, DEMOCRATIC PEOPLE'S REPUBLIC OF");
		


	}

}
