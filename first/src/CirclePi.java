public  class CirclePi
{
	public static void main(String[] args )
	{
		int hit =   0 ; 
		int total = 0 ;
		
		while(true){
		float x =(float) Math.random()*2 -1 ;
		float y =(float) Math.random()*2 -1 ;
		
		if ( x*x + y*y < 1 )
		{
			hit ++ ;
			total ++ ;
		}
		else 
		{
			total ++ ;
			
		}
		
		System.out.println((float)hit/(float)total *4.0f +"    [" + total + "     ]");
		}
	}
	
}