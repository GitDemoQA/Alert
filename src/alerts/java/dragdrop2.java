package alerts.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://speckyboy.com/drag-and-drop-ui/");
        
        driver.findElement(By.xpath("//*[@id=\"output\"]/div[2]")).click();
        
        driver.switchTo().frame(driver.findElement(By.id("result-iframe")));
        
          Actions a = new Actions(driver);
        
        WebElement source=driver.findElement(By.xpath("/html/body/div/div[3]"));
        WebElement target = driver.findElement(By.xpath("/html/body/div/div[4]"));
        a.dragAndDrop(source, target).build().perform();
        
        

	}

}
