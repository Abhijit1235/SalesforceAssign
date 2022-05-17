package salesforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Delete_opportunity {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com/");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
        driver.findElement(By.id("password")).sendKeys("Tuna@123");
        driver.findElement(By.id("Login")).click();
        //driver.findElement(By.className("slds-r5")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30,30));
        //Title of the webpage is "Software Testing Material - A site for Software Testers"
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='slds-global-actions']//child::li[3]")));
        try {
            TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            }  
        driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
        try {
            TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            }  
        driver.findElement(By.xpath("//img[@src ='https://qeagle-dev-ed.my.salesforce.com/logos/Salesforce/SalesCloud/logo.png']")).click();
        //driver.findElement(By.xpath("//a[@href='/lightning/o/Opportunity/home']")).click();
        try {
            TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            }  
        WebElement element2 = driver.findElement(By.xpath("html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[2]/a/span"));
                driver.executeScript("arguments[0].click();", element2); 
    /*  WebElement elem3 = driver.findElement(By.xpath("//a[@title='Oppo to be deleted']"));
                driver.executeScript("agruments[0].click()",elem3);*/
                try{
                    TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    }
                //driver.findElement(By.xpath("//a[@title='Oppo to be deleted']")).click();
                WebElement element = driver.findElement(By.xpath("//a[@title='Oppo to be deleted']"));
                Actions action = new Actions(driver);
                action.moveToElement(element).click().perform();
                try{
                    TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    }
                WebElement element5 = driver.findElement(By.xpath("//ul[@class='slds-button-group-list']//child::lightning-primitive-icon"));
                //driver.executeScript("arguments[0].click();", element5);
                Actions action1 = new Actions(driver);
                action1.moveToElement(element5).click().perform();
                try{
                    TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    }
                WebElement element6 = driver.findElement(By.xpath("//a[@name='Delete']"));
                //driver.executeScript("arguments[0].click();", element5);
                Actions action2 = new Actions(driver);
                action2.moveToElement(element6).click().perform();
                try{
                    TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    }
                WebElement element7 = driver.findElement(By.xpath("(//span[@dir='ltr'])[6]"));
                //driver.executeScript("arguments[0].click();", element5);
                Actions action5 = new Actions(driver);
                action5.moveToElement(element7).click().perform();
    }

	}


