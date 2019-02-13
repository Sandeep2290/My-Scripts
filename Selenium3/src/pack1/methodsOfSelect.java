package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class methodsOfSelect {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/user/Desktop/nonveg.html");
		
		WebElement element = driver.findElement(By.id("khans"));
		Select s = new Select(element);
		s.selectByValue("i");//selecting by value tagname
		s.selectByIndex(2);// selecting by index of the options. index starts from 0
		s.selectByVisibleText("lemonchicken");
		List<WebElement> options = s.getAllSelectedOptions();//returns all the selected options only and not all the options present in the dropdown
		for(WebElement loopval:options)
		{
			System.out.println(loopval.getText());
		}
		Thread.sleep(2000);
		s.deselectAll();
		
	}
}
