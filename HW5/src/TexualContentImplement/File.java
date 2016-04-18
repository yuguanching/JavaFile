package TexualContentImplement;

public class File extends Document{

	private String pathname ;
	
	
	public String toString()
	{
		String str_f ;
		str_f = "Path: " + pathname + "\n" + text ;
		return str_f; 	
	}
	
	public void setPathname(String str_p)
	{
		pathname= str_p ;
	}
	
	public String getPathname()
	{
		return pathname ;
	}
}
