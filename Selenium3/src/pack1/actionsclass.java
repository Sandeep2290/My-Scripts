package pack1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsclass {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://demo.actitime.com/login.do");
		//driver.get("file:///C:/Users/user/Desktop/colorchange.html");
		//Actions a = new Actions(driver);
		//******************double click**********************
		/*driver.get("https://accounts.google.com/ServiceLogin/identifier?service=wise&passive=true&continue=http%3A%2F%2Fdrive.google.com%2F%3Futm_source%3Den_US&utm_medium=button&utm_campaign=web&utm_content=gotodrive&usp=gtd&ltmpl=drive&urp=https%3A%2F%2Fwww.google.co.in%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sandeepramanik");
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		driver.findElement(By.name("password")).sendKeys("Saumyasharma@1july");
		driver.findElement(By.id("passwordNext")).click();
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Doubleclick')]"));
		a.doubleClick(element).perform();*/
		//*******************************************************
		//****************Right click**********************
		/*WebElement element = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
		a.contextClick(element).perform();*/
		//*********************************
		//*************Robot class***********************
		/*Robot r= new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);*/
		//**************************************************
		//**************Double click*******************
		/*WebElement element = driver.findElement(By.id("demo"));
		a.doubleClick(element).perform();*/
		//*********************************************
		
		//***********************drag and drop****************
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement blk1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement blk3 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		Actions a=new Actions(driver);
		//a.dragAndDrop(blk1, blk3).perform();
		//a.clickAndHold(blk1).moveToElement(blk3).release().perform();
		a.clickAndHold(blk1).release(blk3).perform();
		//*******************************************************
		
		

}}
