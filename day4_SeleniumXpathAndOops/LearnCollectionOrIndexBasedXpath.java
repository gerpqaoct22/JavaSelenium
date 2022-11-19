package oct22.day4_SeleniumXpathAndOops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCollectionOrIndexBasedXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Index Based Xpath - Using the Item index: Syntax:(xpath)[index]
		driver.findElement(By.xpath("(//input[@name='webform'])[3]")).click();
		
		//Index Based Xpath - Using Child Item index: Syntax: (parent-xpath)/child-tagname[index]
		driver.findElement(By.xpath("(//div[@style='margin-left:20px;'])/input[6]")).click();
		
		//Index Based Xpath - Using AND Condition:Syntax: //tagName[@attribute1='value1' and @attribute2='value2']
		driver.findElement(By.xpath("//input[@id='vfb-6-1' and @type='checkbox']")).click();
		
		//Index Based Xpath - Using AND Condition:Syntax: //tagName[@attribute1='value1' or @attribute2='value2']
		driver.findElement(By.xpath("//input[@id='vfb-6-0' or @type='checkbox']")).click();
		
		//driver.close();
		

	}

}
