package alerts.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmalert {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver_win32\\chromedriver.exe"); 
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("iframeResult");
		
		
		driver.findElement(By.xpath("/html/body/button")).click();
		
		Thread.sleep(2000);
		
		//driver.switchTo().alert().accept();;
		driver.switchTo().alert().dismiss();
		
		
		

	}

}
