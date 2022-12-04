package oct22.day8_TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DynamicParametrization extends BaseClassForDynamicParametrization {
  
	@Test (dataProvider="fetchData")
  public void myInfo(String firstName, String lastName) throws InterruptedException 
  {
	  driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[6]")).click();
	  driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']")).clear();
	  driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']")).sendKeys(firstName);
	  driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']")).clear();
	  driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']")).sendKeys(lastName);
	  driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	  
  }
	
	@DataProvider
	  public String[][] fetchData() 
	  {
	   String[][] data = new String[6][2];
	   data[0][0] ="Sudhakar";
	   data[0][1]="Karuppannan";
	   data[1][0] ="Sanjeev";
	   data[1][1]="Kumar";
	   data[2][0] ="Tanvinder";
	   data[2][1]="Kour";
	   data[3][0] ="Unmesh";
	   data[3][1]="Kumar";
	   data[4][0] ="Ishmeet";
	   data[4][1]="Panesar";
	   data[5][0] ="Abin";
	   data[5][1]="Sabu";  
	   
	   return data;
	  }
  
}
