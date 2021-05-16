package alerts.java;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stu
		System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");       
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		
		
		
		org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor)driver;
		
		//JavascriptException Js= JavascriptException(driver)
        //Uncomment each scenario by using Ctrl + Shift + \ (backslash) and find the solution

        
        js.executeScript("document.getElementById('email').value='abc';");
        js.executeScript("document.getElementById('pass').value='xyz';");

					
	}

	
}
