package oct22.day5_WebTableAlertFrameSupressNotificaton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnNonModalConfirmationAlert {

	public static void main(String[] args) {
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
