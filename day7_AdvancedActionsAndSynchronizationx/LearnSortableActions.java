package oct22.day7_AdvancedActionsAndSynchronizationx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSortableActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		
		WebElement item1Element = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][1]"));
		WebElement item2Element = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][2]"));
		WebElement item3Element = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][3]"));
		WebElement item4Element = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][4]"));
		WebElement item5Element = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][5]"));
		WebElement item6Element = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][6]"));
		WebElement item7Element = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][7]"));
		
		action.clickAndHold(item2Element).moveToElement(item5Element).release(item5Element).perform();
	}

}
