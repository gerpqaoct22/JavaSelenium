package oct22.day7_AdvancedActionsAndSynchronizationx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelectableActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		driver.switchTo().frame(0);
		WebElement firstItemElement = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement secondItemElement = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement thirdItemElement = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement fourthItemElement = driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement fifthItemElement = driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement sixthItemElement = driver.findElement(By.xpath("//li[text()='Item 6']"));
		WebElement seventhItemElement = driver.findElement(By.xpath("//li[text()='Item 7']"));
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(secondItemElement).click(fifthItemElement).click(sixthItemElement).perform();
		
		
	}

}
