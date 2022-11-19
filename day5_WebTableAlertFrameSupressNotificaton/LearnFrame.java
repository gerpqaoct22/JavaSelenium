package oct22.day5_WebTableAlertFrameSupressNotificaton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Welcome");
		
		driver.switchTo().frame("frame3"); 
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		//driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");	
		WebElement selectDropDwon = driver.findElement(By.id("animals")); 
		Select animals = new Select(selectDropDwon); animals.selectByValue("avatar");
	}

}
