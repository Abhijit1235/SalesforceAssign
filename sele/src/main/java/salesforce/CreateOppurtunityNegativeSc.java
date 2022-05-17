package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOppurtunityNegativeSc {
	@Test
	public static void test () throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver driver=new ChromeDriver(options);

	driver.get("https://login.salesforce.com/");

	driver.manage().window().maximize();

	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");

	driver.findElement(By.id("password")).sendKeys("Tuna@123");

	driver.findElement(By.id("Login")).click();

	Thread.sleep(20000);

	WebElement element = driver.findElement(By.xpath("//div//lightning-primitive-icon/*[@class='slds-icon slds-icon_x-small']"));
	element.click();

	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[contains(text(),'New Opportunity')]")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("(//input[@class=\" input\"])[1]")).sendKeys("opportunity");

	driver.findElement(By.xpath("(//input[@class=\" input\"])[2]")).clear();
	driver.findElement(By.xpath("(//input[@class=\" input\"])[2]")).sendKeys("6/16/2022");


	WebElement dd = driver.findElement(By.xpath("//a[text()='--None--']"));
	dd.click();
	Thread.sleep(7000);
	//driver.findElement(By.xpath("//a[text()='Qualification']")).click();
	Thread.sleep(7000);

	driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
	
	}
	


@AfterMethod
public void AfterUsingTest() {
System.out.println("Create opportunity Is Completed");

	
		
	}


}



