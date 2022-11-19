package oct22.day4_SeleniumXpathAndOops;

public class LearnPolyMethodOverriding extends ParentClass{

	
	//Override - Parent and Child has the same method name and same argument data type
	@Override
	public void addition(int a, int b)
	{
		System.out.println(a+b);
	}	
	
	//@Overload - Within the Class, same Method Name but different argument data type 
	public void addition(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}	
	
	
	public static void main(String[] args) {
		
		LearnPolyMethodOverriding override = new LearnPolyMethodOverriding();
		override.addition(30, 40);
		override.addition(10, 20,30);
	}

}
