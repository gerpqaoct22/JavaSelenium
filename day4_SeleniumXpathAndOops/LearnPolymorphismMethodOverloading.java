package oct22.day4_SeleniumXpathAndOops;

public class LearnPolymorphismMethodOverloading {

	
	public void student(String studName, int studId)
	{
		System.out.println("Student Name is:" +studName);
		System.out.println("Student id: " + studId);
	}
	
	public void student(String studName, int studId, String address)
	{
		System.out.println("Student Name is:" +studName);
		System.out.println("Student id: " + studId);
		System.out.println("student address is: " + address);
	}
	
	
	public void student(int StudId, String address)
	{
		System.out.println("Student Name is:" +address);
		System.out.println("Student id: " + StudId);
	}
	
	public static void main(String[] args) {
		LearnPolymorphismMethodOverloading stud = new LearnPolymorphismMethodOverloading();
		stud.student("Sudhakar", 101);
		stud.student("Sudhakar", 101, "Milton, ON");
		stud.student(101, "Milton, ON");
		

	}

}
