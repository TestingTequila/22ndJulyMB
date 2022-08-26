package _13oopsInheritanceInterface;

public class B implements Base{

	@Override
	public void addition(int a, int b) {

           int sum = 2*a+2*b;
           System.out.println("Addition By B : " + sum);
		
	}

	@Override
	public void subtraction(int a, int b) {
		int diff = 2*a-2*b;
        System.out.println("Subtraction By B : " + diff);
		
	}

	@Override
	public void multiplication(int a, int b) {
		int product = 3*a*b;
        System.out.println("Multiplication By B : " + product);
		
	}

	@Override
	public void division(int a, int b) {
		int div = 2*a/b;
        System.out.println("Division By B : " + div);
		
	}

}
