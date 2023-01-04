package amgtest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;


public class Amgtest {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jayam\\eclipse-workspace\\Miniproj\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	@Test
	public void verify() throws Exception
	{
		String s=driver.getTitle();
		System.out.println(s);
		boolean flag=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
		Assert.assertTrue(flag);
		
    /*   WebElement e= driver.findElement(By.xpath("//div[normalize-space()='EN']"));
       e.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='icp-nav-flyout']")).click();
        Thread.sleep(3000);*/
       
		//finding links in the webpage
        List<WebElement> alltags=driver.findElements(By.tagName("a"));
        System.out.println(alltags.size());
        for(WebElement all:alltags)
        {
        	        	System.out.println(all);
        }
        
	}
	//a[@id='icp-nav-flyout']
    
        
	/*	Thread.sleep(2000);
		
		//finding dropdown if drop down has a tag name select
		 
		 Select s1=new Select(drop);
		Thread.sleep(3000);
		
		s1.selectByIndex(2);
		Thread.sleep(2000);
	
		//div[@id='nav-logo']
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//div[contains(@class,'rush-component s-featured-result-item')]//span[@class='a-size-medium a-color-base a-text-normal'][normalize-space()='Apple iPhone 11 (64GB) - Black']")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
	//	driver.findElement(By.xpath("//input[@id='proceedToRetailCheckout']")).click();
		Thread.sleep(5000);		
	}
/*	@Test
	public void display()
	{
		boolean flag=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
		Assert.assertTrue(flag);
		
	}
	@Test
	public void addcart()
	{
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}*/
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
