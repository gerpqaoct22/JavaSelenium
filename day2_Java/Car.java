package oct22.day2_Java;

public class Car extends Vehicle {

	public void airConditioner()
	{
		System.out.println("Car - airconditioner");
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.airConditioner();
		car.applyBrake();
		car.soundHorn();
	}

}
