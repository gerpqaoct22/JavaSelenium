package oct22.day5_WebTableAlertFrameSupressNotificaton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSupressNotifications {

	public static void main(String[] args) {
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

}
