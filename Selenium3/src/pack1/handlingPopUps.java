package pack1;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Alert;

public class handlingPopUps {

	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}

	public static void main(String[] args) throws Throwable {
		
		/*WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'USERS')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Add User')]")).click();
		driver.findElement(By.xpath("//input[@id='userDataLightBox_firstNameField']")).sendKeys("sandeep");
		driver.findElement(By.xpath("//div[@id='closeUserDataLightBoxBtn']")).click();*/
	//****************Javascript popup********************
	/* WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Alert a = driver.switchTo().alert();
	String txt = a.getText();
	System.out.println(txt);*/
		//**********************javascript popup ends***********************

		//***************************file upload popup**************************
		/*WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://www.naukri.com/");
		WebElement uploadcv = driver.findElement(By.xpath("//input[@id='input_resumeParser']"));
		File cv = new File("./CV/Sandeep.docx");
		String path = cv.getAbsolutePath();
		uploadcv.sendKeys(path);*/
		//*************************file upload popup ends*********************************
		
		//**************geolocation popup*************
		ChromeOptions options = new ChromeOptions();//creating chromeoptions object
		options.addArguments("--disable-notifications");//adding notifications blocking argument
		options.addArguments("--disable-geolocation");//adding geolocation blocking argument
		WebDriver driver = new ChromeDriver(options);//using chromedriver constructor having parameters as options and not the empty chromedriver constructor
		driver.get("https://www.cleartrip.com/");
		//*******************geolocation popup ends**********************
		//*****************window popup
		/*goto seleniumhq and press CTRL+p using robot class
		what we get is window popup
		handle it using escape*/
		//**********************************
		
	}

}
