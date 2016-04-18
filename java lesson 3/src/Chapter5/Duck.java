package Chapter5;

public class Duck {

	private boolean canfly = false ;
	
	public Boolean getcanfly(){
		return canfly ;
	}
	
	public Duck(Boolean canfly)
	{
		this.canfly = canfly ;
		
		
	}
	
	public void quake(){
		
		System.out.println("OnePiece!!!!!!!");
				
	}
	public void quake(String str)
	{
		System.out.println(str);
		
	}
	public String eat(String food){
		String message = "Thank you! The " + food + " is good!";
		return message ;
	}
	
	public void swim (int distance){
		distance = distance -1;
		System.out.println("The distance of my swimming is " +  distance);
		
	}

}
