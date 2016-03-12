
public class AbsMethods {

	public static void main(String[] args) {
		
		JavaDemo JD = new JavaDemo();
		JspDemo  JS = new JspDemo ();
		
		JD.study();
		JS.study();

	}
	
	

}

class JavaDemo extends FuDemo {

	@Override
	public void study() {
		System.out.println("¾Ç²ßjava");
	}
	

}


class JspDemo extends FuDemo {
	

public void HTML () {
}

@Override
public void study() {
	System.out.println("¾Ç²ßJsp+css");
	
}

	
} 


abstract class FuDemo {
public abstract void study() ;

	
}