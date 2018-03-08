package grouplab.itmd515assign3;

/*
	Deborah Barndt
	3-8-18
	MyMessageDITest.java
	Programming Assignment 3
	This is program holds the MyMessageDITest class.
*/

public class MyMessageDITest 
{
	public static void main(String[] args)
	{
		String msg = "Hi Deborah";
		String email = "dbarndt@hawk.iit.edu";
		String phone = "(888)867-5309";
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		// Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		// Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}
}
