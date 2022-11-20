package oct22.day6_Collection_WindHandle_Screenshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Click Here")).click();
	
		Set<String> multipleWindowHandles = driver.getWindowHandles();
		System.out.println(multipleWindowHandles);
		
		List<String> listMultipleWindowHandles = new ArrayList<String>(multipleWindowHandles);
		
		String firstWindow = listMultipleWindowHandles.get(0);
		String secondWindow = listMultipleWindowHandles.get(1);
		
		driver.switchTo().window(secondWindow);
		driver.findElement(By.name("emailid")).sendKeys("Sudhakar");
		driver.switchTo().window(firstWindow);
		String firstPageText = driver.findElement(By.xpath("//h2[text()='Guru99 Bank']")).getText();
		System.out.println(firstPageText);
		
		driver.quit();
	}

}
