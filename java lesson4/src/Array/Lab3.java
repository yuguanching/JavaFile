package Array;

public class Lab3 {

	public static void main(String[] args) {
		
		String[] names = new String[3] ;
		System.out.println(names[0]);
		names[0] = "GGDAYOIN" ;
		System.out.println(names[0]);
		
		
		showmessage(names);
	}

	
	
	public static void showmessage(String[] message)
	{
		System.out.println(message[0]);
	}
}
