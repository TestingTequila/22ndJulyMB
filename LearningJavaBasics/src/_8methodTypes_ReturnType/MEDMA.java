package _8methodTypes_ReturnType;

public class MEDMA {

	public String EmployeeNameOnIdCard(String fName, String lName)
	{
		String fullName=fName +" "+ lName;
		
		System.out.println("Full Name of Employee: " + fullName);
		
		return fName;
	}
}
