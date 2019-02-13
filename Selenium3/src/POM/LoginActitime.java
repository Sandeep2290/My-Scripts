package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginActitime {
	//***creating non static elements
	@FindBy(id="username")//using @Findby method to identify and initialize objects in same statement
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement login;
	
	public LoginActitime(WebDriver driver) {//creating a parametrized constructor with local reference variable driver
		PageFactory.initElements(driver, this);
		
	}
	public void setusername(String un)
	{
		this.username.sendKeys(un);
	}
	public void setpassword(String pass)
	{
		this.password.sendKeys(pass);
	}
	public void loginbutton()
	{
		this.login.click();
	}

}
