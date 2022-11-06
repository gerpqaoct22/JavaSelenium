package oct22.day2_Java;

import oct22.day1_javaintro.Audi;

public class AccessingMethodOutsidePackage {

	public static void main(String[] args) {
		Auto AutoVehicle = new Auto();
		AutoVehicle.handStarter();
		AutoVehicle.soundHorn();
		AutoVehicle.applyBrake();
		AutoVehicle.airConditioner();
		
		Car CarVehicle = new Car();
		CarVehicle.airConditioner();
		CarVehicle.applyBrake();
		CarVehicle.soundHorn();
		
		Audi AudiVehicle = new Audi();
		AudiVehicle.navigationScreen();
		AudiVehicle.airConditioner();
		AudiVehicle.applyBrake();
		AudiVehicle.soundHorn();
	}

}
