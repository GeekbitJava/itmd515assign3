package grouplab.itmd515assign3;

/*
	Deborah Barndt
	3-8-18
	SMSServiceImpl.java
	Programming Assignment 3
	This is program holds the SMSServiceImpl class.
*/

public class SMSServiceImpl implements MessageService
{
	@Override
	public void sendMessage(String msg, String rec)
	{
		// Logic to send SMS
		System.out.println("SMS sent to " + rec + " with Message = " + msg + "!");
	}
}
