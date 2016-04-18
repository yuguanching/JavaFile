package Chapter5;

public class Farm {

	public static void main(String[] args) {
		
		Duck duck = new Duck(true); //new後面是建構子，前面分別為class name 和 物件名稱
		String str  ="kiss my laba!!";
		duck.quake();
		
		duck.quake(str);

		boolean canTheDuckFly = duck.getcanfly() ;
		if(canTheDuckFly == true){
			System.out.println("The duck can fly");
			
		}
		
		String food = "hamburger" ;
		String message = duck.eat(food);
		System.out.println(message);
		
		
		int expectedDistance = 10;
		duck.swim(expectedDistance);
		System.out.println("The expected distance is " + expectedDistance) ;
	}

	
	
}
