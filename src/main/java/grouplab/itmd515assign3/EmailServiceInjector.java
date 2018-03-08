package grouplab.itmd515assign3;

/*
	Deborah Barndt
	3-8-18
	EmailServiceInjector.java
	Programming Assignment 3
	This is program holds the EmailServiceInjector class.
*/

public class EmailServiceInjector implements MessageServiceInjector
{
	public Consumer getConsumer()
	{
		MyDIApplication app = new MyDIApplication();
		app.setService(new EmailServiceImpl());
		return app;
	}
}
