package grouplab.itmd515assign3;

/*
	Deborah Barndt
	3-8-18
	EmailServiceImpl.java
	Programming Assignment 3
	This is program holds the EmailServiceImpl class.
*/

public class EmailServiceImpl implements MessageService
{

	public void sendMessage(String msg, String rec) {
		// TODO Auto-generated method stub
		System.out.println("Email sent to " + rec + " with Message=" + msg);
	}
	
	
	/*@Override
	public void sendMessage(String msg, String rec)
	{
		// Logic to send email
		System.out.println("Email sent to " + rec + " with Message=" + msg);
	}*/
}
