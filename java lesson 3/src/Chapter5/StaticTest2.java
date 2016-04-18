package Chapter5;

public class StaticTest2 {

	public static int port = 80 ;
	public static void main(String[] args) {
	
		StaticTest2 obj1 = new StaticTest2();
		StaticTest2 obj2 = new StaticTest2();
		System.out.println(StaticTest2.port);
		System.out.println(obj1.port);
		System.out.println(obj2.port);
		StaticTest2.port = 1234;
		System.out.println(obj1.port);
		obj2.port = 5678;
		System.out.println(obj1.port);

	}

}
