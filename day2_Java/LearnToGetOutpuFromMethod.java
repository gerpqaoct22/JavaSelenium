package oct22.day2_Java;

public class LearnToGetOutpuFromMethod {
	
	public static int sum;
	
	
	// void will not return value
	public int add(int a, int b)
	{
		sum=a+b;
		System.out.println(sum);
		return sum;
	}
	
	public String student(String studName)
	{
		return studName;
	}

	public static void main(String[] args) {
		
		LearnToGetOutpuFromMethod Ltgofm = new LearnToGetOutpuFromMethod();
		Ltgofm.add(10, 20);
		
		sum = sum+1;
		System.out.println(sum);
		
		String stud = Ltgofm.student("Sudhakar");
		System.out.println(stud);

	}

}
