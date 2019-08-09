package pack1;

abstract class Animal{
	public abstract void eats(); 
	public abstract void makeSound(); 
	public abstract void roam(); 
	public void sleeps() {
	 System.out.println("Animal Sleeps ");	
	}
	
}

abstract class Herbivore extends Animal{
	public void eats() {
		System.out.println("eats grass");
	}
}

class Cow extends Herbivore{
	public void makeSound() {
		System.out.println("Mooo");
	}
	public void roam() {
		System.out.println("in four legs");
	}
}
public class AnimalApp {
	public static void main(String[] args) {
		Animal a = new Cow();
		a.eats();
		a.makeSound();
		a.sleeps();
		a.roam();
	}
}
