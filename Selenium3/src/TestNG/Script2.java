package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Script2 {
	//@Test(priority=0)
	@Test
	public void script1()
	{/*boolean cnd1=false;//after running the actual script, you will get result as true or false. here we have written directly
		Assert.assertEquals(cnd1, true);//assert class present in testNG is used to make decisions. statements below this wont get executed if assert statements fails
*/		
		Reporter.log("script1",true);
		
	}
	//@Test(priority=-3)//priority can be given to test script that we want to run first
	@Test
	public void script2()
	{
		//Assert.fail();//we can directly fail a test case by using assert.fail();statements below this wont get executed if assert statements fails
		Reporter.log("script2",true);
	}
	//@Test(priority=-1,invocationCount=5)//if we want to run the test case more than once, we can use invocation count
	@Test
	public void script3()
	{
		SoftAssert a=new SoftAssert();//softassert is used if we want next statement after assert statements to be executed even though assert got failed. we need to create object for it
		a.fail();
		Reporter.log("script3",true);
	}
		////@Test(priority=2)
	@Test(dependsOnMethods={"script1","script2","script3"})//if we want to run script4 only if other 3 scripts pass, then we use dependsOnMethods
	public void script4()
	{
		Reporter.log("script4",true);
	}
	
	
}
