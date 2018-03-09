package grouplab.itmd515assign3;

/*
	Deborah Barndt
	3-8-18
	MyDIApplication.java
	Programming Assignment 3
	This is program holds the MyDIApplication class.
*/

public class MyDIApplication implements Consumer
{
	private MessageService service;
	
	public MyDIApplication(MessageService svc)
	{
		this.service=svc;
	}
	
	public MyDIApplication() {
		
	}
	
	// Setter dependency injection
	public void setService(MessageService service)
	{
		this.service = service;
	}
	
	@Override
	public void processMessages(String msg, String rec) 
	{
		// Do some msg validation, manipulation logic, etc.
		this.service.sendMessage(msg, rec);
	}

}
