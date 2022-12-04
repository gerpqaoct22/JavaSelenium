package oct22.day10_TestNGAndCucumber;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTest implements IRetryAnalyzer {

	int initialCount =0;
	int maxRetry=3;
	
	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess() && initialCount < maxRetry)
		{
			initialCount++;
			return true;
		}
		
	
	return false;
}

}
