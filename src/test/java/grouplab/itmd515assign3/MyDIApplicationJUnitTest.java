package grouplab.itmd515assign3;

/*
	Deborah Barndt
	3-8-18
	MyDIApplicationJUnitTest.java
	Programming Assignment 3
	This is program holds the MyDIApplicationJUnitTest class.
*/

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyDIApplicationJUnitTest {
	private MessageServiceInjector injector;
	
	@Before
	public void setUp()
	{
		//mock the injector with anonymous class
		injector = new MessageServiceInjector() 
		{
			
			public Consumer getConsumer() 
			{
				//mock the message service
				return new MyDIApplication(new MessageService() 
				{
					
					public void sendMessage(String msg, String rec) 
					{
						System.out.println("Mock Message Service Implementation");
						
					}
				});
			}
		};
	}
	
	@Test
	public void test() 
	{
		Consumer consumer = injector.getConsumer();
		consumer.processMessages("Hi Pankaj", "pankaj@abc.com");
	}
	
	@After
	public void tear()
	{
		injector = null;
	}

}
