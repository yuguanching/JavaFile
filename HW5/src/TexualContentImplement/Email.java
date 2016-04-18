package TexualContentImplement;

public class Email extends Document {

	private String sender ;
	private String recipient  ;
	private String title  ;
	
	
	public String toString()
	{
		String str_e ;

		str_e = "From: " + sender + "\n" + "To: " + recipient + "\n" + "Title: " + title + "\n" + text  ;
		
		
		return  str_e;
	}
	
	public void setSender(String str_s)
	{
		sender = str_s ;
	}
	
	public String getSender()
	{
		return sender; 
		
	}
	
	public void setRecipient(String str_r)
	{
		recipient = str_r ;
		
	}
	
	public String getRecipient()
	{
		return recipient; 
	}
	
	public void setTitle(String str_t)
	{
		title = str_t ;
	}
	
	public String getTitle()
	{
		return title;
	}


}

	
