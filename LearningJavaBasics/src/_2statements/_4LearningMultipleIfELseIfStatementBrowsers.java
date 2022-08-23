package _2statements;

public class _4LearningMultipleIfELseIfStatementBrowsers {

	public static void main(String[] args) {

            String browser="firefox";
            
            if(browser.equalsIgnoreCase("IE"))
            {
            	System.out.println("Open IE browser");
            }
            else if(browser.equalsIgnoreCase("Safari"))
            {
            	System.out.println("Open safari browser");
            }
            else if (browser.equalsIgnoreCase("Chrome"))
            {
            	System.out.println("Open Chrome browser");
            }
            else if (browser.equalsIgnoreCase("Firefox"))
            {
            	System.out.println("Open Firefox browser");
            }
            else
            {
            	System.out.println("Launch Edge browser");
            }

	}

}
