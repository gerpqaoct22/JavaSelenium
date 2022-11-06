package oct22.day2_Java;

import oct22.day1_javaintro.LearnJavaIntro;

public class LearnInputToTheMethod {
	
	public void learnJava(String course)
	{
		System.out.println(course);
	}
	
	public void student (String studName, int studId)
	{
		System.out.println(studName);
		System.out.println(studId);
		
	}
		
	public static void main(String[] args) 
	{
		
		//ClassName ObjectName = new ClassName();
		LearnInputToTheMethod Litm = new LearnInputToTheMethod();	
		
		//objectName.methodName();
		Litm.learnJava("Welcome to Java");
		Litm.student("Sudhakar", 101);
		Litm.student("Rajesh", 102);
	}
}
