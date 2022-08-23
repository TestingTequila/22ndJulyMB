package _5class;

public class Execution {

	public static void main(String[] args) {

        //NameOfClassWhoseCopyYouWantToCreate NameYouWantTOGiveTOCopiedVersion = new NameOfClassWhoseCopyYouWantToCreate();
		
		Resume jason = new Resume();
		
		jason.firstName="Jason";
		jason.lastName="Hill";
		jason.jobTitle="QA";
		jason.contactNumber=4534543;
		jason.workExperience=5;
		jason.companyName="Google";
		
		
		Resume kerrie = new Resume();
		kerrie.firstName="Kerrie";
		kerrie.lastName="Wright";
		kerrie.jobTitle="HR";
		kerrie.contactNumber=56546546;
		kerrie.workExperience=10;
		kerrie.companyName="Microsoft";
		
		
		System.out.println(jason.firstName + " "+jason.lastName + " " + jason.jobTitle);
		
		
		
		
	}

}
