package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLogin {
	
	@FindBy(xpath="//input[@id='identifierId']")
	private WebElement emailid;
	@FindBy(xpath="//div[@id='identifierNext']")
	private WebElement nextbutton;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	@FindBy(xpath="//div[@id='passwordNext']")
	private WebElement nextbtn;
	
	public GmailLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void emailentry(String id)
	{
		this.emailid.sendKeys(id);
	}
	public void nextbutt()
	{
		this.nextbutton.click();
	}
	public void passwrd(String p)
	{
		this.password.sendKeys(p);
	}
	public void nextbt()
	{
		this.nextbtn.click();
	}

}
