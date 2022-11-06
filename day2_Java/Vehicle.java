package oct22.day2_Java;

public class Vehicle {

	public void applyBrake()
	{
		System.out.println("Vehicle - Apply Brake");
	}
	
	public void soundHorn()
	{
		System.out.println("Vehicle - Sound Horn");
	}
	
	public static void main(String[] args) {
		Vehicle veh = new Vehicle();
		veh.applyBrake();
		veh.soundHorn();
	}

}
