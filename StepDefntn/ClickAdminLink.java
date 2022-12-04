package StepDefntn;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClickAdminLink extends BaseClass{
	
	@When ("Click the admin link")
	public void clickAdminLink()
	{		
		driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")).click();
	}
	
	
	@Then ("Admin page is displayed")
	public void adminPage()
	{
		String text = driver.findElement(By.xpath("(//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module'])")).getText();
		System.out.println(text);
	}

}
