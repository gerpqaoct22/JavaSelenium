package oct22.day3_SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnStartWithXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[starts-with(text(),'SAP F')]")).click();
		
		//driver.findElement(By.xpath("//input[@name='email' or @id='email']")).sendKeys("Toronto");

		
		driver.findElement(By.xpath("//img[@alt='Guru99 Demo Sites' or @role='presentation']")).click();
		
	}

}
