package TestNG;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Annotations {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	@org.testng.annotations.BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	@Test
	public void script1()
	{
		Reporter.log("script 1",false);
	}
	
}
