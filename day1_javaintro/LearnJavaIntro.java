package oct22.day1_javaintro;

public class LearnJavaIntro 
{

	//method
	//accessSpecifier void methodName()
	public void learnJava()
	{
		System.out.println("Welcome to Java");
	}
		
	public static void main(String[] args) 
	{
		
		//ClassName ObjectName = new ClassName();
		LearnJavaIntro Lji = new LearnJavaIntro();	
		
		//objectName.methodName();
		Lji.learnJava();
	}

}
