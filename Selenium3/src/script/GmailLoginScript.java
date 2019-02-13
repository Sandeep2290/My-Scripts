package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.GmailLogin;

public class GmailLoginScript {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		GmailLogin g = new GmailLogin(driver);
		g.emailentry("sandeepramanik");
		g.nextbutt();
		g.passwrd("blabla321");
		g.nextbt();
				

	}

}
