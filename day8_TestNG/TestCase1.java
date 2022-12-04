package oct22.day8_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 extends BaseClass {
	@Test
	public void learnNonModalSimpleAlert() {
		
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
