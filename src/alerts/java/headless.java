package alerts.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headless {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumDocs\\chrome driver 88\\chromedriver.exe");   
		ChromeOptions chromeOptions =new ChromeOptions();
		chromeOptions.setHeadless(true);
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.amazon.in/");
		driver.getTitle();
		String s =driver.getTitle();
		
		System.out.println(s);	
		

	}

}
