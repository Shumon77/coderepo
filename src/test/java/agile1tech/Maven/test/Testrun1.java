package agile1tech.Maven.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testrun1 {

	public static void main(String[] args) {
	
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Selenium File\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
	        
	        
	        driver.navigate().to("https://www.phptravels.net/register");
	        
			//driver.findElement(By.name("firstName")).sendKeys("John");
	        
	       // driver.findElement(By.name("lastName")).sendKeys("Bob");
	        
	       //Alert alert = driver.switchTo().alert();
		

	}
       WebDriver driver;
}
