package grouplab.itmd515assign3;

/*
	Deborah Barndt
	3-8-18
	MyDIApplicationJUnitTest.java
	Programming Assignment 3
	This is program holds the MyDIApplicationJUnitTest class.
*/


public class MyDIApplicationJUnitTest 
{
	private MessageServiceInjector injector;
	
	@Before
	public void setUp()
	{
		// Mock the injector with anonymous class.
		injector = new MessageServiceInjector()
		{
			@Override
			public Consumer getConsumer()
			{
				// Mock the message service.
				return new MyDIApplication(new MessageService()
				{
					@Override
					public void sendMessage(String msg, String rec)
					{
						System.out.println("Mock Message Service implementation");
					}
				});
			}
		};
	}
	
	@Test
	public void test()
	{
		Consumer consumer = injector.getConsumer();
		consumer.processMessages("Hi Deborah", "dbarndt@hawk.iit.edu");
	}
	
	@After
	public void tear()
	{
		injector = null;
	}
}
