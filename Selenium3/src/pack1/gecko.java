package pack1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gecko {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./gecko/geckodriver.exe");
	}
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//a[contains(text(),'3.141')]")).click();
		//**************File download popup can be handled using robot class******************
		Robot r=new Robot();//robot class to enter any keyboard operation
		r.keyPress(KeyEvent.VK_ENTER);// pressing the enter key
		r.keyRelease(KeyEvent.VK_ENTER);//releasing the enter key
		//r.keyPress(KeyEvent.VK_ESCAPE);//pressing escape key
		//r.keyRelease(KeyEvent.VK_ESCAPE);//releasing escape key
		//******************************************************************************
		

	}

}
