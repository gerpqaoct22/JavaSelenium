package oct22.day2_Java;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
			
		
		//dataType[] variableName = new dataType[size]
		//size is also called length
		
		int[] nums = new int[6];

		//nums[index]
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3]=40;
		nums[4]=50;
		nums[5]=60;
		
		int a[] = {90,70,80,10,75,55};
		
		for (int i=0; i<6; i++)
		{
			System.out.println(nums[i]);
		}
		
		Arrays.sort(a);
		for (int j=5; j>=0; j--)
		{
			System.out.println("This is for variable a: "+ a[j]);			
			
		}
		
	
		
		
		
		
		
		

	}

}
