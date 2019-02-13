package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.FacebookLogin;

public class FacebookScript {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		FacebookLogin fb=new FacebookLogin(driver);
		fb.setEmailId("sandeepramanik");
		fb.setPassword("blabla23");
		fb.clickLogin();

	}

}
