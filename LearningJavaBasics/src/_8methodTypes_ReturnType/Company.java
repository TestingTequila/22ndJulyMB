package _8methodTypes_ReturnType;

public class Company {

	public int calclulateSalary(int basicSalary, int travelAllowance)
	{
		int salary=basicSalary + travelAllowance;
		System.out.println("Salary without bonus :" + salary);
		return salary;
	}
	
}
