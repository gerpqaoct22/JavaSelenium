package oct22.day8_TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	@Test
	public void learnWebTable() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//Step1: Get in to the Webtable
		WebElement webTable = driver.findElement(By.xpath("(//table)[2]"));
		
		//Step2: From the WebTable, access All the TableRows
		List<WebElement> allTableRows = webTable.findElements(By.tagName("tr"));
		int tableSize = allTableRows.size();
		System.out.println(tableSize);
		
		//To get the row 0 value (preliminary step for understanding)
		//System.out.println(allTableRows.get(0).getText());
		
		//Step3: Get in to each Row
		for (int row=0; row<allTableRows.size(); row++)
		{
			//System.out.println(allTableRows.get(row).getText());
			
			WebElement eachRow = allTableRows.get(row);
			//System.out.println(eachRow);
			
			//Step 4: Find the td element
			List<WebElement> allColumns = eachRow.findElements(By.tagName("td"));
			//System.out.println(allColumns.size());
			
			//Step 5: Get in to each Column
			  for (int col=0; col<allColumns.size(); col++) 
			  {
			  System.out.println("Row" + row + " Column" + col + " value is: " + allColumns.get(col).getText()); 
			  }
			 
		}
		driver.close();
	}

}
