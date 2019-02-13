package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lengthwidth {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//driver.manage().window().maximize();
		//************************Webelement methods(getsize(), getlocation())****************
		/*WebElement user=driver.findElement(By.xpath("//input[@name='email']"));
		WebElement pwd=driver.findElement(By.xpath("//input[@id='pass']"));
		int h1=user.getSize().getHeight();
		int w1=user.getSize().getWidth();
		int h2=pwd.getSize().getHeight();
		int w2=pwd.getSize().getWidth();
		if(h1==h2 && w1==w2)
		{
			System.out.println("Test case pass");
		}
		else
			System.out.println("Test case failed");
		*/
		
		WebElement loc=driver.findElement(By.xpath("//span[contains(text(),'Facebook')]"));
		int xval=loc.getLocation().getX();
		int yval=loc.getLocation().getY();
		System.out.println(xval);
		System.out.println(yval);
	}

}
