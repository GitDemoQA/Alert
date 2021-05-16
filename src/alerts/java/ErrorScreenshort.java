package alerts.java;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorScreenshort {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver_win32\\chromedriver.exe"); 
			
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.gmail.com");
			
			List<WebElement> links=driver.findElements(By.linkText("Rajanikanth"));
			if(links.size()==0)
			{
				File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File("C:\\SeleniumDocs\\Screensshots\\google.png"));
			}

	}

}
