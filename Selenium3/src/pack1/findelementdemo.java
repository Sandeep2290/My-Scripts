package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementdemo {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/Googlepage.html");
		//driver.findElement(By.id("t1")).click();
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.className("c1")).click();		
		//driver.findElement(By.name("d1")).click();
		//driver.findElement(By.partialLinkText("Google")).click();
		driver.findElement(By.linkText("Google")).click();

	}

}
