package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/xpathpage.html");
		/* absolute xpath
		
		driver.findElement(By.xpath("html/body/div[1]/input[1]")).sendKeys("A is selected");
		driver.findElement(By.xpath("html/body/div[1]/input[2]")).sendKeys("B is selected");
		driver.findElement(By.xpath("html/body/div[2]/input[1]")).sendKeys("C is selected");
		driver.findElement(By.xpath("html/body/div[2]/input[2]")).sendKeys("D is selected");
		driver.findElement(By.xpath("html/body/div[1]/input[1]|html/body/div[2]/input[2]")).sendKeys("AD is selected using pipeline operator");
		driver.findElement(By.xpath("html/body/div[1]/input[2]|html/body/div[2]/input[1]")).sendKeys("BC is selected using pipeline operator");
		driver.findElement(By.xpath("html/body/div/input[1]")).sendKeys("AC is selected");
		driver.findElement(By.xpath("html/body/div/input[2]")).sendKeys("BD is selected");
		driver.findElement(By.xpath("html/body/div[1]")).sendKeys("AB is selected");
		driver.findElement(By.xpath("html/body/div[2]")).sendKeys("CD is selected");*/
		
		/* relative xpath
		driver.findElement(By.xpath("//div[1]/input[1]")).sendKeys("A is selected");
		driver.findElement(By.xpath("//div[1]/input[2]")).sendKeys("B is selected");
		driver.findElement(By.xpath("//div[2]/input[1]")).sendKeys("C is selected");
		driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("D is selected");
		driver.findElement(By.xpath("//div[1]")).sendKeys("AB is selected");
		driver.findElement(By.xpath("//div[2]")).sendKeys("CD is selected");
		driver.findElement(By.xpath("//div/input[1]")).sendKeys("AC is selected");
		driver.findElement(By.xpath("//div/input[2]")).sendKeys("BD is selected");
		driver.findElement(By.xpath("//div[1]/input[1]|//div[1]/input[2]")).sendKeys("AD is selected");
		driver.findElement(By.xpath("//div[2]/input[1]|//div[1]/input[2]")).sendKeys("BC is selected");*/
		
		driver.findElement(By.xpath("//td[1]/input")).sendKeys("username");
		driver.findElement(By.xpath("//td[2]/input")).sendKeys("Password");
		driver.findElement(By.xpath("//td[3]/label")).click();
		
		
		

	}

}
