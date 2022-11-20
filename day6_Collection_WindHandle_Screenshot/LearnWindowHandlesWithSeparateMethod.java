package oct22.day6_Collection_WindHandle_Screenshot;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandlesWithSeparateMethod {
	
	public static ChromeDriver driver;
	public void windowHandles(int index)
	{
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> multipleWindows = new LinkedList<String>(windowHandles);
		String windowReference = multipleWindows.get(index);
		driver.switchTo().window(windowReference);
	}
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Click Here")).click();	
		
		LearnWindowHandlesWithSeparateMethod lwhs = new LearnWindowHandlesWithSeparateMethod();		
		lwhs.windowHandles(1);		
		driver.findElement(By.name("emailid")).sendKeys("Sudhakar");
		lwhs.windowHandles(0);
		String firstPageText = driver.findElement(By.xpath("//h2[text()='Guru99 Bank']")).getText();
		
		


	}

}
