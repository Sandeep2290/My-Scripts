package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptcode {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement loc=driver.findElement(By.xpath("//span[contains(text(),'Facebook')]"));
		int xval=loc.getLocation().getX();
		int yval=loc.getLocation().getY();
		JavascriptExecutor j=(JavascriptExecutor)driver;//type casting from webdriver interface to javascriptExecuter interface
		j.executeScript("window.scrollBy(0,818)");//to scrol down and reach the Facebook © 2018
		j.executeScript("window.scrollBy("+xval+","+yval+")");//use java string breaking technique
		
		driver.get("file:///C:/Users/user/Desktop/disableddemo.html");
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("document.getElementById('t1').value='Sandeep'");*/
		
		driver.get("https://www.plus2net.com/javascript_tutorial/enable-disable-demo.php");
		Thread.sleep(2000);
		JavascriptExecutor gh=(JavascriptExecutor)driver;
		gh.executeScript("document.getElementsByName('other_text').value='Sandeep'");

	}

}
