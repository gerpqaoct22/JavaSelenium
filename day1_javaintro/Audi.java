package oct22.day1_javaintro;

import oct22.day2_Java.Car;

public class Audi extends Car {
	
	public void navigationScreen()
	{
		System.out.println("Audi - Navigation Screen");
	}

	public static void main(String[] args) {
		Audi audi = new Audi();
		audi.navigationScreen();
		audi.airConditioner();
		audi.applyBrake();
		audi.soundHorn();
	}

}
