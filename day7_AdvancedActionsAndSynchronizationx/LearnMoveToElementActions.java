package oct22.day7_AdvancedActionsAndSynchronizationx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMoveToElementActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement mensFashions = driver.findElement(By.xpath("(//a[@class='menuLinks leftCategoriesProduct '])[1]/span[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(mensFashions).perform();
		
		Thread.sleep(2000);
		
		WebElement shirts = driver.findElement(By.xpath("((//div[@class='colDataInnerBlk'])[2])/descendant::span[3]"));
		shirts.click();
		
		
	}

}
