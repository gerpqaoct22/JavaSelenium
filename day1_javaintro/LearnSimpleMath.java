package oct22.day1_javaintro;

public class LearnSimpleMath {

	public static int number1 =104;
	public static int number2= 20;
	
	public void addition()
	{
		//dataType variableName = variableValue;
		int add = number1+number2;
		System.out.println("Additon is: " + add);
	}
	
	public void subtraction()
	{
		int subtraction = number1-number2;
		System.out.println("Subtraction is: " + subtraction);
	}
	
	public void multiplication()
	{
		int multiplication = number1*number2;
		System.out.println("Multiplicatio is: " + multiplication);
	}
	
	public void division()
	{
		int division = number1/number2;
		System.out.println("Division is: " + division);
	}
	
	public void mod()
	{
		int mod = number1%number2;
		System.out.println("Mod is: " + mod);
	}
	
	public static void main(String[] args) {
		LearnSimpleMath Calculator = new LearnSimpleMath();
		Calculator.addition();
		Calculator.subtraction();
		Calculator.multiplication();
		Calculator.division();
		Calculator.mod();
		
		boolean Mod = false;	
		
		
	}

}
