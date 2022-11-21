package oct22.day7_AdvancedActionsAndSynchronizationx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDoubleClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		
		/*
		 * WebElement doubleClickElement = driver.findElement(By.
		 * xpath("//p[text()='Double click to resize this object.']"));
		 * 
		 * action.contextClick(doubleClickElement).perform();
		 */
		
		WebElement doubleClickAction = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		action.doubleClick(doubleClickAction).perform();
		

	}

}
