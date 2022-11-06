package oct22.day2_Java;

public class Bajaj extends Auto {

	public void speakerSystem()
	{
		System.out.println("Baja - Speaker System");
	}
	
	public static void main(String[] args) {
		Bajaj bajaj = new Bajaj();
		bajaj.speakerSystem();
		bajaj.handStarter();
		bajaj.applyBrake();
		bajaj.soundHorn();
	

	}

}
