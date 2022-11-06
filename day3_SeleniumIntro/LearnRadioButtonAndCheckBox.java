package oct22.day3_SeleniumIntro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnRadioButtonAndCheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//click the radio button Option2
		driver.findElement(By.id("vfb-7-2")).click();
		
		//click first checkbox
		driver.findElement(By.id("vfb-6-0")).click();
		
		//click first checkbox
		driver.findElement(By.id("vfb-6-1")).click();
		
		//click first checkbox
		driver.findElement(By.id("vfb-6-2")).click();
		
		//close the current window of the browser
		driver.close();
	}

}
