package oct22.day3_SeleniumIntro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumIdLocator {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		//SafariDriver driver = new SafariDriver();
		
		driver.get("https://demo.guru99.com/test/login.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Ctrl+2+L is the shortcut key to get the return type
		//WebElement emailAddress = driver.findElement(By.id("email"));
		//emailAddress.sendKeys("sudhakar.karuppa@gmail.com");
		
		//identify the email textfield element by locator id and entering the email id using sendKeys method
		driver.findElement(By.id("email")).sendKeys("sudhakar.karuppa@gmail.com");
		
		//identify the password textfield element by locator id and entering the password using sendKeys method
		driver.findElement(By.id("passwd")).sendKeys("test");
		
		//identify the "Sign in" button element by locator id and clicking the button using click method
		driver.findElement(By.id("SubmitLogin")).click();
		
		
		
		
		
		
		
		
		
		

	}

}
