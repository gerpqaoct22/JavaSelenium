package oct22.day4_SeleniumXpathAndOops;

public class Condo implements House {

	public static void main(String[] args) {
		Condo condo = new Condo();
		condo.bedRoom();
		condo.washroom();
		condo.kitchen();

	}

	public void bedRoom() {
		System.out.println("This is condo - Bedroom");
		
	}

	public void kitchen() {
		System.out.println("This is condo - Kitchen");
		
	}

	public void washroom() {
		System.out.println("This is condo - Washroom");
	}

}
