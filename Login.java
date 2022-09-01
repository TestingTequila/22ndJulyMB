package janbaskScenariosAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		// 1. Open the browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		// 2. Enter the url of the application
		driver.get("http://janbaskdemo.com/");
		
		// 3. Click on My Account Icon
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		
		Thread.sleep(5000);
		
		// 4. Click on Login Link
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		

		
		// 5. Enter correct email Address
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("forest.grump@janbask.com");
		

		
		// 6. Enter correct Password
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@1234");
		

		
		// 7. Click on Login button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// 8. Validate Login Status
		String pageTitle= driver.getTitle();
		
	    if(pageTitle.equals("My Account"))
	    {
	    	System.out.println("Login is successfull");
	    }
	    else
	    {
	    	System.out.println("Login Failed- Check your credentials");
	    }
		
		// 9. Close the Browser
		driver.close();

	}

}
