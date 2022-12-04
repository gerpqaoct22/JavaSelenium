package oct22.day10_TestNGAndCucumber;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class TestNGDependsOnMethods {
	
	  
		@Test(groups ="smoke", retryAnalyzer=RetryFailedTest.class)
		public void login()  
		{
			System.out.println("This is login method");
			throw new NoSuchElementException();
		}
		
		@Test(groups ="functional", dependsOnMethods ="login", retryAnalyzer=RetryFailedTest.class)
		public void createOrder()
		{
			System.out.println("This is Create Order");
		}
		
		@Test(groups ="functional", retryAnalyzer=RetryFailedTest.class)
		public void updateOrder()
		{
			System.out.println("This is Update Order");
		}
		
		@Test(groups ="functional", retryAnalyzer=RetryFailedTest.class)
		public void deleteOrder()
		{
			System.out.println("This is Delete Order");
		}
		
		@Test(groups ="functional", retryAnalyzer=RetryFailedTest.class)
		public void reports()
		{
			System.out.println("This is Reports");
		}
		
		@Test(groups ="regression", retryAnalyzer=RetryFailedTest.class)
		public void graphs()
		{
			System.out.println("This is Graphs");
		}
	}
