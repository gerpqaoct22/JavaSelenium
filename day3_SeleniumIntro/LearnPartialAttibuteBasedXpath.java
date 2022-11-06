package oct22.day3_SeleniumIntro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnPartialAttibuteBasedXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Basic Syntax for Xpath is: //tagName[@attribute='attributeValue']
		//driver.findElement(By.xpath("//input[@id='vfb-6-0']")).click();
		
		//Partial Attribute Xpath: //tagName[contains(@attribute='partialAttributeValue')]
		driver.findElement(By.xpath("//input[contains(@id, '-6-0')]")).click();

	}

}
