package FirstPack;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS1 extends PS {

	@Test
	public void testRun()
	{
		// call the method with object 
		// PS ps = new PS();
		// ps.doThis(); 
		
		System.out.println("Added Line GitFWS");
		// Test
		System.out.println("Added Line 2");
		System.out.println("Added Line 3");
		System.out.println("Added Line 4");
		
		int a = 7;
		doThis(); // connected to the parent class
		// Lets create a new object
		PS2 ps2 = new PS2(a); // Parameterized Constructor
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		
		//PS3 ps3 = new PS3(a); this line is skipped with inheretience 
		System.out.println(ps2.multiplyThree()+"Added Line GitFWS ");
		//System.out.println(ps3.multiplyTwo());
		
	}

}
