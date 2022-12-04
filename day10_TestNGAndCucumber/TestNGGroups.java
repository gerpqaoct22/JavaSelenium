package oct22.day10_TestNGAndCucumber;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class TestNGGroups {
  
	@Test(groups ={"smoke","functional"})
	public void login()  
	{
		System.out.println("This is login method");
		throw new NoSuchElementException();
	}
	
	@Test(groups ="functional", dependsOnGroups ="smoke")
	public void createOrder()
	{
		System.out.println("This is Create Order");
	}
	
	@Test(groups ="functional")
	public void updateOrder()
	{
		System.out.println("This is Update Order");
	}
	
	@Test(groups ="functional")
	public void deleteOrder()
	{
		System.out.println("This is Delete Order");
	}
	
	@Test(groups ="functional")
	public void reports()
	{
		System.out.println("This is Reports");
	}
	
	@Test(groups ="regression")
	public void graphs()
	{
		System.out.println("This is Graphs");
	}
}
