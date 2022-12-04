package oct22.day8_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnPriorityAttribute {
 
	@Test  (enabled=false)
	public void DropDown() {
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
		country.selectByVisibleText("OREA, DEMOCRATIC PEOPLE'S REPUBLIC OF");
		driver.close();


	}
	
	@Test  (enabled=true)
	public void LearnSuppressNotification() {
		WebDriverManager.chromedriver().setup();
		
		//ChromeDriver driver = new ChromeDriver();
		//Suppress the browser notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		

	}
	
	
	@Test  (enabled=true)
	public void LearnNonModalSimpleAlert() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Non-Modal - Simple Alert button
		//Alert simpleAlert = driver.switchTo().alert();
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		//Handling Simple Alert
		
		Alert simpleAlert = driver.switchTo().alert();
		  //driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		  simpleAlert.accept();
		  
		  		
		
		
		String text = driver.findElement(By.xpath("//p[text()='You successfully clicked an alert']")).getText();
		System.out.println(text);
		
		

	}

}
