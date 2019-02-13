package pack1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class p1 {
	static
	{
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./gecko/geckodriver.exe");
		
	}

	public static void main(String[] args) throws Throwable {
		
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.naukri.com");
		//driver.get("https://www.facebook.com");
		//WebDriver driver = new FirefoxDriver();
				
		/*String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String ps = driver.getPageSource();
		System.out.println(ps);
		
		String wh = driver.getWindowHandle();//why cd in the hexadecimal address
		System.out.println(wh);
		
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();*/
				
		Set<String> wds = driver.getWindowHandles();
		System.out.println(wds);
		
		for(String var:wds)//for each loop
		{
			driver.switchTo().window(var);
			String newTitle = driver.getTitle();
			System.out.println(newTitle);
			if(newTitle.equals("Fullerton"))
			{
				driver.close();
				}
			Thread.sleep(1000);
		}
		}

}
