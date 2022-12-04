package oct22.day9_TestNGAndCucumber;

import org.testng.annotations.Test;

import oct22.day8_TestNG.BaseClassForDynamicParametrization;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class DynamicParametrization extends BaseClassForDynamicParametrization{
 
	@Test(dataProvider = "retrieveData")
  	public void myInfo(String firstName, String lastName) throws InterruptedException
		  {
			  driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[6]")).click();
			  driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']")).clear();
			  driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']")).sendKeys(firstName);
			  driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']")).clear();
			  driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']")).sendKeys(lastName);
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
			  
		  }	
  
	@DataProvider
	public String[][] retrieveData() throws IOException
	{
		ReadExcelData rd = new ReadExcelData();
		String[][] fetchData = rd.fetchData();
		return fetchData;
		
		
	}
	
	
	
}
