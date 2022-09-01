package janbaskScenariosAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {

	public static void main(String[] args) {

		// 1. Open the Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// 2. Enter the URL of the application
		driver.get("http://janbaskdemo.com/");

		// 3. Click on My Account Icon
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();

		// 4. Click on Register link
		driver.findElement(By.xpath("//a[text()='Register']")).click();

		// 5. Fill the registration form
		driver.findElement(By.id("input-firstname")).sendKeys("Forest");
		driver.findElement(By.id("input-lastname")).sendKeys("Grump");
		driver.findElement(By.name("email")).sendKeys("forest.grump@janbask.com");
		driver.findElement(By.id("input-telephone")).sendKeys("567657");
		Select countryddl = new Select(driver.findElement(By.id("input-country")));
		countryddl.selectByVisibleText("Sweden");
		driver.findElement(By.id("input-password")).sendKeys("test@1234");
		driver.findElement(By.id("input-confirm")).sendKeys("test@1234");
		driver.findElement(By.xpath("//input[@value=1 and @name='newsletter']")).click();
		Select subscription = new Select(driver.findElement(By.name("subscription")));
		subscription.selectByVisibleText("Monthly");

		// 6. Click on Privacy Policy Checkbox
		driver.findElement(By.name("agree")).click();

		// 7. Click on Continue button
		driver.findElement(By.id("submitbtn")).click();

		// 8. Verify registration status
		String pageTitle = driver.getTitle();
		if (pageTitle.equals("Your Account Has Been Created!")) {
			System.out.println("Congratulations...your account is created");
		} else {
			System.out.println("Account with this email id already exists");
		}
		// 9. Close the browser
		driver.close();

	}

}
