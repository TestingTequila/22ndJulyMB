package _15oopsPolyOverriding;

public class B extends A{

	@Override
	public void addition(int a, int b)
	{
		int sum = a*a+b*b;
		System.out.println("Addition A: " + sum);
		super.addition(a, b);
		
	}
}
