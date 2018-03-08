package grouplab.itmd515assign3;

/*
	Deborah Barndt
	3-8-18
	SMSServiceInjector.java
	Programming Assignment 3
	This is program holds the SMSServiceInjector class.
*/

public class SMSServiceInjector implements MessageServiceInjector
{
	public Consumer getConsumer()
	{
		return new MyDIApplication(new SMSServiceImpl());
	}
}
