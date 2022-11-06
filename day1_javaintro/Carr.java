package oct22.day1_javaintro;

public class Carr 
{
	
	//Global Variable
	public static int gasCapacity = 75;
	
	public void driveCar()
	{
		int maxSpeedPerHour = 250;
		int noOfTyres = 4;
		int noOfSeats = 5;
		System.out.println("I am driving Car");
		System.out.println(maxSpeedPerHour);
		//Syso Ctrl+Space+Enter 
		System.out.println(noOfTyres);
		System.out.println(noOfSeats);
		System.out.println(gasCapacity);
	}
	
	public void soundHorn()
	{
		System.out.println("Sound Horn");
		
	}
	
	public static void main(String[] args) 
	{
		//ClassNmae ObjectName = new Clas)sName();
		Carr Toyota = new Carr();
		Toyota.driveCar();
		Toyota.soundHorn();
		

		//dataType variableName = variableValue;
		
		//Press F4 on ClassName
		String carName = "Toyota Camry";
		double carPrice = 49999.99;
		
		
		System.out.println(gasCapacity);
		System.out.println(carName);
		System.out.println(carPrice);
		
	}

}
