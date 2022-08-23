package _7methodTypes_VariablesLocation;

public class ExecutingCalculations {

	public static void main(String[] args) {

		Calculations_GlobalVariable calc = new Calculations_GlobalVariable();
		calc.num1=100;
		calc.num2=20;
		calc.addition();
		
		
		Calculations_Parameters calcP = new Calculations_Parameters();
		calcP.addition(222, 80);
		
		
		Calculations_LocalVariable calcL = new Calculations_LocalVariable();
		calcL.addition();

	}

}
