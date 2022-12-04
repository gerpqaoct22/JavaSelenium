package oct22.day8_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnNonModalConfirmationAlert {

	@Test
	public void learnNonModalConfirmationAlert() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Non-Modal - Confirmation Alert button
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Alert confirmationAlert = driver.switchTo().alert();
		confirmationAlert.dismiss();
		
		String dismissText = driver.findElement(By.xpath("//p[text()='You clicked: Cancel']")).getText();
		System.out.println(dismissText);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		confirmationAlert.accept();
		
		String acceptText = driver.findElement(By.xpath("//p[text()='You clicked: Ok']")).getText();
		System.out.println(acceptText);
	}

}
