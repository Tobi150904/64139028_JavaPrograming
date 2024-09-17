package Bai6;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat("Tam the", true);
		Dog dog = new Dog("Alaska", false);
		
		System.out.println(cat.toString());
		System.out.println(dog.toString());
		
		Animal animal = new Cat("Tam the", true);
		Animal animal2 = new Dog("Alaska", false);
		System.out.println(animal.toString());
		System.out.println(animal2.toString());
	}
}
