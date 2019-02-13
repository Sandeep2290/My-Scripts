package pack1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo {

	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/user/Desktop/nonveg.html");
		
		/*driver.findElement(By.xpath("//option[contains(text(),'peperdry')]")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		driver.findElement(By.xpath("//option[contains(text(),'lemonchicken')]")).click();*/
		
		WebElement element = driver.findElement(By.id("khans"));
		Select s = new Select(element);
		List<WebElement> li = s.getOptions();// returns all the options present in dropdown
		for(WebElement loopvariable:li)//for each loop
		{
			System.out.println(loopvariable.getText());
			loopvariable.click();
		}

	}

}
