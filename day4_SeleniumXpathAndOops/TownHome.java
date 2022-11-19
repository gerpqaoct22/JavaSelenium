package oct22.day4_SeleniumXpathAndOops;

public class TownHome implements House, CIBIL {
	
	public void bedRoom() {
	System.out.println("THis is a Bedroom");	
		
	}

	public void kitchen() {
		System.out.println("This is a Kitchen");
		
	}

	public void washroom() {
		System.out.println("This is a Washroom");
		
	}
	
	public static void main(String[] args) {
		TownHome townHome = new TownHome();
		townHome.bedRoom();
		townHome.kitchen();
		townHome.washroom();
	}


}
