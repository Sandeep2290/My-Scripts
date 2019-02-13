package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmaillogin {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		/*driver.findElement(By.id("identifierId")).sendKeys("sandeepramanik");
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.id("passwordNext")).click();*/
		driver.findElement(By.cssSelector("input[name='identifier']")).sendKeys("sandeepramanik");
		driver.findElement(By.cssSelector("div[id='identifierNext']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("1235");
		driver.findElement(By.cssSelector("div[id='passwordNext']")).click();
	}

}
