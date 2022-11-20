package oct22.day6_Collection_WindHandle_Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Step1: Get the source screen shot as Output file
		File sourceScreenShot = driver.getScreenshotAs(OutputType.FILE);
		
		//Step 2: Create a Target File
		File targetFile = new File("./data/datOct22/irctc.png");
		
		
		FileUtils.copyFile(sourceScreenShot, targetFile);
		
		
		

	}

}
