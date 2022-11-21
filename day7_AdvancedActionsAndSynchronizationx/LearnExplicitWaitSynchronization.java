package oct22.day7_AdvancedActionsAndSynchronizationx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnExplicitWaitSynchronization {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("passwd"));
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		
		sendKeys(driver, username, 30, "Admin");
		sendKeys(driver, password, 20, "admin123");		
		click(driver, login, 10);

	}
	public static void sendKeys(WebDriver driver, WebElement element, int timeOut, String value)
	{
		new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public static void click(WebDriver driver, WebElement element, int timeOut)
	{
		new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOf(element));
		element.click();
	}

}
