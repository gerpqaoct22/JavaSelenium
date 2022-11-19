package oct22.day4_SeleniumXpathAndOops;

import week2.day2.RBI;

public class IndGovt extends HomeMinistry implements RBI  {
	
	

	public static void main(String[] args) {
		IndGovt india = new IndGovt();
		india.homeLoan();
		india.goldLoan();
		india.fixedDeposit();
		india.savingsAccount();
	}

	@Override
	public void homeLoan() {
		
		System.out.println("Home Loan is: 10%");
	}

	public void fixedDeposit() {
		System.out.println("This is fixedDeposit: 15%");
		
	}

	public void savingsAccount() {
		System.out.println("This is savingsAccount: 12%");
		
		
	}
	

}
