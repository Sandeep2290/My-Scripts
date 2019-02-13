package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script3 
{
	
	@Test(groups={"smoke","functional"})
	public void script1()
	{ //Assert.fail();
		Reporter.log("Script1", true);
	}
	@Test(groups={"smoke","functional"})
	public void script2()
	{
		Reporter.log("Script2", true);
	}
	@Test(groups={"smoke"})
	public void script3()
	{
		Reporter.log("Script3", true);
	}
	@Test(dependsOnGroups={"smoke"})//depends on groups is used if the test case depends on other test cases belonging to other groups
	//@Test
	public void script4()
	{
		Reporter.log("Script4", true);
	}
	@Test(groups={"smoke"})
	public void script5()
	{
		Reporter.log("Script5", true);
	}
	
}
