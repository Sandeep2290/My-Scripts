package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin {
	@FindBy(id="email")
	private WebElement emailid;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loginButton;
	
	public FacebookLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void setEmailId(String email)
	{
		this.emailid.sendKeys(email);
	}
	public void setPassword(String pwd)
	{
		this.password.sendKeys(pwd);
	}
	public void clickLogin()
	{
		this.loginButton.click();
	}
	

}
