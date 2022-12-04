package runner;

import StepDefntn.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = "src/test/java/features",
glue ="StepDefntn",
publish = true,
monochrome = true,
tags="@smoke or @regression")

public class oct22_CucumberLoginOrangeHRM extends BaseClass{
	
	
}
