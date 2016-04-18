package AbstractClass;

public class House {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();

		playwith(dog);
		playwith(cat);

		
		dog.sit();
		cat.sit();
	}

	
	public static void playwith(Animal animal){
		animal.run();
	}
}
