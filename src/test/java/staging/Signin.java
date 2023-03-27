package staging;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Signin 
{
	WebDriver driver;

	@Test
	public void launch() 
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	//	driver.get("https://tradebazaar.tech-active.com/");
		driver.get("https://trade.ekbazaar.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	
		
	}
	
	@Test
	public void signin() throws InterruptedException
	{
	
		driver.findElement(By.xpath("//a[@class=\"sign-in-btn\"]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Number\"]")).sendKeys("9380368240");
		Thread.sleep(2000);  // 9380368240
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Tester@123");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		
		driver.findElement(By.xpath("//input[@value=\"Sign In\"]")).click();
		Thread.sleep(2000);
		
		
	}
	
	
	@Test
	public void sellernumber() throws InterruptedException 
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	/*	WebElement seller = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[1]/div/div[2]/ul/li[1]/div]"));
	    Thread.sleep(2000);
		
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click", seller);  */
		
		
		
		driver.findElement(By.xpath("//*[@id=\"not-active-head\"]/div[1]/div/div[2]/ul/li[3]/a")).click();
		
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		//driver.navigate().refresh();   // to refresh the page
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
