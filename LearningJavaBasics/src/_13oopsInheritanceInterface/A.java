package _13oopsInheritanceInterface;

public class A implements Base{

	@Override
	public void addition(int a, int b) {

           int sum = a+b;
           System.out.println("Addition By A : " + sum);
		
	}

	@Override
	public void subtraction(int a, int b) {
		int diff = a-b;
        System.out.println("Subtraction By A : " + diff);
		
	}

	@Override
	public void multiplication(int a, int b) {
		int product = a*b;
        System.out.println("Multiplication By A : " + product);
		
	}

	@Override
	public void division(int a, int b) {
		int div = a/b;
        System.out.println("Division By A : " + div);
		
	}

}
