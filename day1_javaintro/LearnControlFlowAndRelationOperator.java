package oct22.day1_javaintro;

public class LearnControlFlowAndRelationOperator {

	public static int a= 105;
	public static int b= 105;
	
	public void lessAndGreater()
	{
		//if (condition){}
		if (a<b)
		{
			System.out.println("Value of " + a + " is less than " + b);
		}
		
		else if (a>b)
		{
			System.out.println("Value of " + a + " is greater than " + b);
		}
		
		else 
		{
			System.out.println("Value of " + a + " is equal to " + b);
		}
	}
	
	public static void main(String[] args) {
		LearnControlFlowAndRelationOperator Lcf = new LearnControlFlowAndRelationOperator();
		Lcf.lessAndGreater();
		

	}

}
