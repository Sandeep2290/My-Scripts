package pack1;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicit wait works only on findelement or findelements method
		
		/*driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//Thread.sleep(4000);
		//******************explicit wait**********************
		WebDriverWait wait=new WebDriverWait(driver, 10);// creating a new object of type driver and wait for 10 seconds
		wait.until(ExpectedConditions.titleContains("Enter "));// wait till expected condition is satisfied which says title contains "Enter ". we can mention multiple conditions
		//*******************explicit wait ends******************
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();*/
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		
		//*******************explicit wait with different condition
		/* WebDriverWait w=new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='logoutLink']")));*/
		//**************************explicit wait ends********************
		
		//************************Fluent wait************************
		
		/*FluentWait fw=new FluentWait(driver);
		fw.pollingEvery(250, TimeUnit.MILLISECONDS);
		fw.withTimeout(30, TimeUnit.SECONDS);
		fw.ignoring(NoSuchElementException.class);
		fw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='logoutLink']")));*/
		
	//*************************************************************************
		
		/*WebDriverWait wed=new WebDriverWait(driver, 10);
		wed.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='logoutLink']")));*/
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
	}

}
