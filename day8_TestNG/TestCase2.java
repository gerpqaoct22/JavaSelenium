package oct22.day8_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 extends BaseClass {
	@Test
	public void learnNonModalPromotAlert() throws InterruptedException {
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Non-Modal: Click the "Click for JS Prompt" to get the Prompt Alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Hi, Welcome to Java Selenium");
		promptAlert.accept();
		
		Thread.sleep(2000);
		String promptAlerttext = driver.findElement(By.xpath("//p[text()='You entered: Hi, Welcome to Java Selenium']")).getText();
		System.out.println(promptAlerttext);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		promptAlert.dismiss();
		
		System.out.println("Dismissed");
		

	}
}
