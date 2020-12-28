package agile1tech.Maven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testrun {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
	
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
		
        WebDriver driver1 = new ChromeDriver();
        
        
        driver1.get("https://jpetstore.cfapps.io/catalog");
        
        Thread.sleep(3000);
        
		driver1.findElement(By.name("firstname")).sendKeys("John");
        
        //driver.findElement(By.name("")).sendKeys("");
        
		
		
		
		
		
		
		
		
	
	}
	


}
