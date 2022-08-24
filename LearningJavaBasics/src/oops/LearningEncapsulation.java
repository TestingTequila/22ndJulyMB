package oops;

public class LearningEncapsulation {

	 private String name;
	 private int salary;
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(salary>10000)
		{
			System.out.println("Incorrect salary entered");
		}
		else
		{
			this.salary = salary;
		}
		
	}
	 
	 
}



