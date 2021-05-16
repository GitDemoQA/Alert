package alerts.java;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class linkss {

	public static void main(String[] args) throws IOException, InterruptedException 
	
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumDocs\\chrome driver 88\\chromedriver.exe");       
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.durgasoftonline.com/");
		
	
		
		//driver.get("https://www.spicejet.com");
		//driver.get("http://google.com");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
			   String linkname=links.get(i).getText();
			   links.get(i).click();
			   
			   File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(srcFile,new File("C:\\SeleniumDocs\\Screensshots\\"+linkname+".jpeg"));
			   Thread.sleep(3000);
			   //driver.navigate().back();
			   links=driver.findElements(By.tagName("a"));
		    }

	}

}
}
