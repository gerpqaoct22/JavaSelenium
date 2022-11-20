package oct22.day6_Collection_WindHandle_Screenshot;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Click Here")).click();
		//driver.findElement(By.name("emailid")).sendKeys("Sudhakar");
		
		String currentWindowHandle = driver.getWindowHandle();
		System.out.println(currentWindowHandle);
		
		driver.close();

	}

}
