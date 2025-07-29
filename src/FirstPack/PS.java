package FirstPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {
	
	// methods,variables

	public void doThis()

	{
		System.out.println("I am here");
		System.out.println("random changes");
		System.out.println("random changes2");
		System.out.println("random changes33");
		
	}
	@BeforeMethod
	public void beforeRun()
	{
		System.out.println("Run me first");
		System.out.println("Run me first change");
	}
	
	@AfterMethod
	public void afterRun()
	{
		System.out.println("Run me last");
		System.out.println("Run me last change");
	}
	
}
