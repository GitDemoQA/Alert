package alerts.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize(); 
        
        Actions a = new Actions(driver);
        
        WebElement source = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
        
        a.moveToElement(source).build().perform();
        
        
        
        
        
        //driver.get("https://jqueryui.com/droppable");
        
        /*driver.get("https://jqueryui.com/droppable/#accepted-elements");
        driver.manage().window().maximize(); 
        
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        
        Actions a = new Actions(driver);
        
        WebElement S1= driver.findElement(By.id("draggable-nonvalid"));
        
        WebElement S2= driver.findElement(By.id("draggable"));
        
        WebElement t1= driver.findElement(By.id("droppable"));
        
        a.dragAndDrop(S1, t1).build().perform();
        a.dragAndDrop(S2, t1).build().perform(); */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       /* driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        
        Actions a = new Actions(driver);
        
        
        WebElement source = driver.findElement(By.id("draggable"));
         
        WebElement target = driver.findElement(By.id("droppable"));
        
        a.dragAndDrop(source, target).build().perform();*?
        
        
        
        
       
       
       
       
       
       
       
        
        //driver.get("https://jqueryui.com/droppable/#accepted-elements");
        
       /* driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
        
        
        //driver.switchTo().frame(driver.fBy.xpath("//*[@id=\"content\"]/iframe"));
        
        Actions a = new Actions(driver);
        
        WebElement A = driver.findElement(By.id("draggable"));
        WebElement B = driver.findElement(By.id("droppable"));
        a.dragAndDrop(A, B).build().perform();
        
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/ul/li[2]/a")).click();*/
        
        
     /*   driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
        
        Actions b= new Actions(driver);
        
        WebElement AB = driver.findElement(By.xpath("//*[@id=\"draggable-nonvalid\"]/p"));
        
        WebElement AC = driver.findElement(By.id("draggable"));
        
        WebElement target= driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
        
        b.dragAndDrop(AB, target).build().perform();
        b.dragAndDrop(AC, target).build().perform();*/
        
        
        
        
        
        
        
       /* driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        
        Actions a = new Actions(driver);
        
        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        a.dragAndDrop(source, target).build().perform();*/
        
        
        

        
       // driver.switchTo().defaultContent();
        

	}

}
