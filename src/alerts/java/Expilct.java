package alerts.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expilct {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ABC");
		driver.findElement(By.id("pass")).sendKeys("xyz");
		
		 WebDriverWait wait = new WebDriverWait(driver,30);
		
		// explicit wait - to wait for the login button to be click-abl
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='loginbutton']")));
	// click on the login button as soon as the "login" button is visible
	  driver.findElement(By.xpath("//label[@id='loginbutton']")).click();

		        


	}

}
