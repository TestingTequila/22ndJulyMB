package _4arrays;

public class _LearningArrays {

	public static void main(String[] args) {

		// 12, 43, 76, 98, 75, 53

		// 1. dataType[] arrayName = {value1, value2, value3, value4.......valueN};

		int[] numbers = { 12, 43, 76, 98, 75, 53, 99, 55, 33, 44, 345, 876, 61};

		//1
		
		for(int x=0;x<numbers.length;x++)
		{
			System.out.println(numbers[x]);
			
		}

		// Jason, Roger, Lee, Kerrie, Nathan

		String[] names = { "Jason", "Roger", "Lee", "Kerrie", "Nathan" };
		
		
		int i=0;
		
		while(i<names.length)
		{
			System.out.println(names[i]);
			i++;
		}
		
		
		String[] menus = {"HOME", "GIFT CERTIFICATES", "BRANDS", "BLOGS" , "CONTACT US"};
		
		
		

	}

}
