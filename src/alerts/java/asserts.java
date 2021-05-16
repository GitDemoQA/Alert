package alerts.java;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class asserts {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumDocs\\chrome driver 88\\chromedriver.exe");       
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
        String expected = "https://www.google.com";

       String actualURL= "https://www.google.com";
       
       asserts.assertEquals(expected, actualURL);
        
        
        
        
      //  Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

      //Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

      //driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

     // System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

      //Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
       
	}

	private static void assertEquals(String expected, String actualURL) {
		// TODO Auto-generated method stub
		
	}

}
