package oct22.day2_Java;

public class Auto extends Vehicle {
	
	public void handStarter()
	{
		System.out.println("Auto - handstarter");
	}
	
	public void airConditioner()
	{
		System.out.println("Auto - airConditioner");
	}

	public static void main(String[] args) {
		Auto auto = new Auto();
		auto.handStarter();
		auto.airConditioner();
		auto.applyBrake();
		auto.soundHorn();

	}

}
