package Chapter5;


public class StaticTest {

	public static void main(String[] args) {

		int sum = add(1,1) ;
		System.out.println(sum);
		
		StaticTest st = new StaticTest() ;
		
		sum = st.add2(2, 2) ;
		System.out.println(sum);
		
	}

	
	public static int add(int a,int b){
	
	return a + b ;
	
	}
	
	public int add2(int a, int b)
	{
		return a + b ;
		
	}
	}
	
	
	
	
	

