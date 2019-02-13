package pack1;

import java.io.File;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takescreenshotsInterface {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		TakesScreenshot t=(TakesScreenshot)driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File des = new File("./Photo/abc.png");
		FileUtils.copyFile(source, des);
		
	}

}
