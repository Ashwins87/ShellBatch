package Sample.shell4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TrainingShell {

	
	@Test //Annotation
	public void login()
	{
		System.out.println("login executed");
		
	}
	
	@Test
	public void customerinformation()
	{
		System.out.println("customer information verfied");
	}
	
	
	@Before //Annotation called before test case execution
	public void setup()
	{
		System.out.println("Environment up and running" );
		System.out.println("Connectivity is good");
	}
	
	@After//AfterTest
	public void teardown()
	{
		System.out.println("clear the cache");
		System.out.println("Delete the auidt logs from the DB");
	}
	
	
}


