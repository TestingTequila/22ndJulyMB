package _8methodTypes_ReturnType;

public class Calculations {

	
	// WAP to print addition of two numbers
	
	public void additionWithoutReturnType(int num1, int num2)
	{	
		int sum=num1+num2;
		System.out.println("Addition: " + sum);
	}
	
	public int additionWithReturnType(int num1, int num2)
	{	
		int sum=num1+num2;
		System.out.println("Addition: " + sum);
		return sum;
	}
	
	
}
