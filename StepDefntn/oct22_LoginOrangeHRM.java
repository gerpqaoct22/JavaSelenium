package StepDefntn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class oct22_LoginOrangeHRM extends BaseClass  {
	
	//public static ChromeDriver driver;
		
	
	/*
	 * @Given ("Opening the ChromeBrowser") public void openBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); }
	 * 
	 * @Given ("Access the OrangeHrm url") public void accessUrl() { driver.get(
	 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); }
	 */
		
		@Given ("Enter the username {string}")
		public void enterUserName(String uname)
		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		}
				
		@Given ("Enter the password {string}")
		public void enterPassword(String pword)
		{
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pword);
		}
		
		
		@When ("Click the Login button")
		public void clickLogin()
		{
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		}
		
		@Then ("OrangeHRM dashboard page displayed")
		public void orangeHRMDashboard()
		{
		driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
		}
		
		@But ("Error message displayed")
		public void errorDisplayed()
		{
		String error = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
		System.out.println(error);
		}
}

