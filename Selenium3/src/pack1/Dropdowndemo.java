package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdowndemo {

	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		WebElement element = driver.findElement(By.id("menu-item-381"));
		//***************Actions class*****************
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();// mouseover operation can be performed using movetoelement method present in actions class
		//*******************************************
		driver.findElement(By.xpath("//a[text()='Contact']")).click();
		WebElement text = driver.findElement(By.xpath("//div[contains(text(),'Bangalore')]/..//div[contains(text(),'+91')]"));
		System.out.println(text.getText());

	}

}
