package _2statements;

public class _3LearningMultipleIfElseIfStatement {

	public static void main(String[] args) {

           // WAP to print the activity depending upon what day of the week it is
		
		String day = "Sunday";
		
		if(day.equals("Monday"))
		{
			System.out.println("I have to go to office");
		}
		
		else if(day.equals("Tuesday"))
		{
			System.out.println("I have to go to Church");
		}
		
		else if(day.equals("Wednesday"))
		{
			System.out.println("I have to meet my old friends");
		}
		
		else if (day.equals("Thursday"))
		{
			System.out.println("I will go for picnic");
		}
		
		else if (day.equals("Friday"))
		{
			System.out.println("Its Friday- Lets Party");
		}
		else
		{
			System.out.println("Its weekend - i will take rest");
		}
		
		

	}

}
