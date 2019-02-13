package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpathdemo {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		
		/*driver.get("file:///C:/Users/user/Desktop/Relativexpathdemo.html");
		driver.findElement(By.xpath("//input[@type='text' and @value='A']")).sendKeys("Relative xpath for A1");
		driver.findElement(By.xpath("//input[@type='text' and @value='B']")).sendKeys("Relative xpath for B1");
		driver.findElement(By.xpath("//input[@type='button' and @value='A']")).click();
		driver.findElement(By.xpath("//input[@type='button' and @value='B']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();*/
		
		/*just to practice xpath
		driver.findElement(By.xpath("//input[@type='text' or @type='button']")).sendKeys("XPath for A1B1A2B2 using or operator");
		driver.findElement(By.xpath("//input[not(@type='checkbox')]")).sendKeys("Xpath for A1B1A2B2 using not operator");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("xpath for A1B1");
		driver.findElement(By.xpath("//input[@type='button']")).sendKeys("xpath for A2B2");
		driver.findElement(By.xpath("//input[@value='A']")).sendKeys("xpath for A1A2");
		driver.findElement(By.xpath("//input[@value='B']")).sendKeys("xpath for B1B2");*/
		
		
		//**************demosite************************
		/*driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("username");//username
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("password");//password
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();//loginbutton
		driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();
		driver.findElement(By.xpath("//nobr[contains(text(),'actiTIME')]")).click();//actiTIME using contains keyword as actiTIME 2017.4 is text in nobr tagname
		driver.findElement(By.xpath("//img[1]")).click();//image
		//driver.findElement(By.xpath("//a[@target='_blank']")).click();//link
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();//link using text()
*/		
		//*************************************************
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sandeep");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pramanik");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9304930364");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Abn123!");
		driver.findElement(By.xpath("//select[@title='Day']")).sendKeys("2");
		driver.findElement(By.xpath("//select[@aria-label='Month']")).sendKeys("Feb");
		driver.findElement(By.xpath("//select[@aria-label='Year']")).sendKeys("1990");
		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		//************Independent dependent x-path
		
		//In seleniumhq downloads, to select downloads link, take xpath for ruby-> then go to its parent-> then traverse to 4th child or search that child directly
		/*driver.findElement(By.xpath("//td[text()='Ruby']/../td[2]")).click();
		driver.findElement(By.xpath("//td[text()='Ruby']/../td[4]/a[contains(text(),'Download')]")).click();
		driver.findElement(By.xpath(("//a"))).click();//taking all the anchor tags in an array, we can use ("xpath here").
		driver.findElement(By.xpath("(//a[contains(text(),'Super')])[1]/..//div[@class='_1vC4OE']")).click();//independent dependent xpath, then use // to go to required descendent of the respective parent
		*///************************************************
	}

}
