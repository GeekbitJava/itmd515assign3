package grouplab.itmd515assign3;

/*
	Deborah Barndt
	Thomas Boller
	3-8-18
	MyApplication.java
	Programming Assignment 3
	This is program holds the MyApplication class.
*/

public class MyApplication 
{
	private EmailService email = new EmailService();
	
	public void processMessages(String msg, String rec)
	{
		// Do some message validation, manipulation logic, etc.
		this.email.sendEmail(msg, rec);
	}
}
