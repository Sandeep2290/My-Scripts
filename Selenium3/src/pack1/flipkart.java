package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(2000);
	System.out.println(driver.findElements(By.xpath("//div[contains(text(),'Now')]")).size());*/
	
	/*driver.get("https://www.amazon.in/");
	System.out.println(driver.findElements(By.xpath("//span[contains(text(),'Ends in')]")).size());*/
		
		/*driver.get("https://www.plus2net.com/javascript_tutorial/enable-disable-demo.php");
	WebElement checkbox = driver.findElement(By.xpath("//input[@name='others']"));
	WebElement textbox = driver.findElement(By.xpath("//input[@name='other_text']"));
		System.out.println(checkbox.isSelected());
		System.out.println(textbox.isEnabled());
		checkbox.click();
		System.out.println(textbox.isEnabled());
		System.out.println(checkbox.isSelected());
		*/
		
		

	}

}
