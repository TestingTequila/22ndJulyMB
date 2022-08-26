package _14oopsPolymorphism;

public class PolymorphismOverloading {

	public void addition(int a, int b)
	{
		int sum = a+b;
		System.out.println("Addition: " + sum);
	}
	
	public void addition(int a, int b, int c, int d)
	{
		int sum = a+b;
		System.out.println("Addition: " + sum);
	}
	
	public void addition(int a, double b)
	{
		double sum = a+b;
		System.out.println("Addition: " + sum);
	}
	
	public void addition(double a, double b)
	{
		double sum = a+b;
		System.out.println("Addition: " + sum);
	}
	
	public void addition(long a, double b)
	{
		double sum = a+b;
		System.out.println("Addition: " + sum);
	}
	
	public void addition(int a, double b, int c)
	{
		double sum = a+b;
		System.out.println("Addition: " + sum);
	}
}
