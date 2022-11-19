package oct22.day4_SeleniumXpathAndOops;

public class ParentClass {
	
	/*
	 * public void cash(int money) { System.out.println(money); }
	 */
		
	/*
	 * public void addition(int a, int b) { System.out.println(a+b); }
	 */	
		
		public void addition(int a, int b)
		{
			System.out.println(a*b);
		}

		public static void main(String[] args) {
			ParentClass parent = new ParentClass();
			parent.addition(10,20);
	}

}
