
	package pack1;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class StaleElementExceptionDemo {

		static
		{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
		}
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://demo.actitime.com/login.do");
			WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
			driver.navigate().refresh();//Refresh the page before passing value and after identifing element. You may get stale element reference exception.
			username.sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
		}

	
}
