package oct22.day4_SeleniumXpathAndOops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnRelationBasedXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Relation Based Xpath - Younger Cousin:Syntax: (xpath)/following::cousin-tagname
		String sapCourseName = driver.findElement(By.xpath("(//a[text()='SAP PP'])/following::a[1]")).getText();
		System.out.println("SAPCourseName is: " + sapCourseName);
		
		//Relation Based Xpath - Elder Cousin:Syntax: (xpath)/preceding::cousin-tagname
		String courseVBScript = driver.findElement(By.xpath("//a[text()='Apache']/preceding::a[5]")).getText();
		System.out.println("VBScript Course Name is: " +courseVBScript);
		
		//Relation Based Xpath - Younger Sibling: Syntax: (xpath)/following-sibling::sibling-tagName
		//driver.findElement(By.xpath("(//li[@style='width:100%;'])[3]/following-sibling::li")).click();
		
		//Relation Based Xpath - Elder Sibling: Syntax: (xpath)/preceding-sibling::sibling-tagName
		//driver.findElement(By.xpath("(//li[@style='width:100%;'])[7]/preceding-sibling::li[1]")).click();
		
		//Relation Based Xpath - Child: //TagName[@attribute='value']/child::tagname
		String agileCourseName = driver.findElement(By.xpath("(//li[@style='width:100%;'])[7]/child::a")).getText();
		System.out.println("AgileCourseName is:" + agileCourseName);
		
		//Relation Based Xpath - Parent: Syntax: //TagName[@attribute='value']/parent::tagname		
		//driver.findElement(By.xpath("//a[text()='SoapUI']/parent::li")).click();
		
		String qtpCourseName = driver.findElement(By.xpath("//ul[@id='java_technologies']/descendant::a[2]")).getText();
		System.out.println("QTP Course Name is: " + qtpCourseName);
		
		//Relation Based Xpath -ancestor: Syntax: //*[@attribute='value']/ancestor::tagName		
		//a[text()='Live Ecommerce Project']/ancestor::ul
		
		
		
		
	}

}
