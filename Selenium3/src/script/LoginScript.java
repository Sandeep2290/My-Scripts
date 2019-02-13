package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.LoginActitime;

public class LoginScript {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		LoginActitime ob=new LoginActitime(driver);//using the parametrized constructor created in POM file
		ob.setusername("admin");
		ob.setpassword("manager");
		ob.loginbutton();
		

}
}