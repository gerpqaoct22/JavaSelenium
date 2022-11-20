package oct22.day6_Collection_WindHandle_Screenshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import mar22.week4.day8.windowhandling.WindowHandles;

public class LearnWIndowHandlesWithMethod {
	
	public static ChromeDriver driver;
	
	public void windowHandles(int index)
	{
		Set<String> multipleWindowHandles = driver.getWindowHandles();
		//System.out.println(multipleWindowHandles);
		
		List<String> listMultipleWindowHandles = new ArrayList<String>(multipleWindowHandles);
		String string = listMultipleWindowHandles.get(index);
		driver.switchTo().window(string);
	}
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Click Here")).click();	

		LearnWIndowHandlesWithMethod lwhs = new LearnWIndowHandlesWithMethod();
		
		lwhs.windowHandles(1);		
		driver.findElement(By.name("emailid")).sendKeys("Sudhakar");
		lwhs.windowHandles(0);
		String firstPageText = driver.findElement(By.xpath("//h2[text()='Guru99 Bank']")).getText();
		System.out.println(firstPageText);
		
		driver.quit();
		}
	
}
