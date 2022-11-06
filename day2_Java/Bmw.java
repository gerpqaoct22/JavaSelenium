package oct22.day2_Java;

public class Bmw extends Car{

	public void powerWindows()
	{
		System.out.println("BMW - Power Windows");
	}
	public static void main(String[] args) {
		Bmw bmw = new Bmw();
		bmw.powerWindows();
		bmw.airConditioner();
		bmw.applyBrake();
		bmw.soundHorn();
	}

}
