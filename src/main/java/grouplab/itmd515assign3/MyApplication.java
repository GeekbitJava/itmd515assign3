package grouplab.itmd515assign3;

/*
	Deborah Barndt
	3-8-18
	MyApplication.java
	Programming Assignment 3
	This is program holds the MyApplication class.
*/

public class MyApplication 
{
	private EmailService email = null;
	
	public MyApplication(EmailService svc)
	{
		this.email=svc;
	}
	
	public MyApplication() {
		// TODO Auto-generated constructor stub
	}

	public void processMessages(String msg, String rec)
	{
		// Do some message validation, manipulation logic, etc.
		this.email.sendEmail(msg, rec);
	}
}
