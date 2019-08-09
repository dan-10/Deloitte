package Pack;

public class AnimalApp {
	
	

	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		c.sound();
		Cat c1 = new Cat();
		System.out.println(c.equals(c1));
	}


}
   