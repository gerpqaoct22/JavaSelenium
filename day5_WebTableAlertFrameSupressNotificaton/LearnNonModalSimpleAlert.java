package oct22.day5_WebTableAlertFrameSupressNotificaton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnNonModalSimpleAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Non-Modal - Simple Alert button
		Alert simpleAlert = driver.switchTo().alert();
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		//Handling Simple Alert
		
		 // Alert simpleAlert = driver.switchTo().alert();
		  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		  simpleAlert.accept();
		  
		  		
		
		
		String text = driver.findElement(By.xpath("//p[text()='You successfully clicked an alert']")).getText();
		System.out.println(text);
		
		

	}

}
