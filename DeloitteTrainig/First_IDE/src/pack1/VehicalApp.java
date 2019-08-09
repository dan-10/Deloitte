package pack1;
abstract class Vehicle{
	public abstract void start();
}

class Car extends Vehicle{
	@Override
	 public void start() {
		System.out.println("Car is starting");
	}
}
public class VehicalApp {
		public static void main(String[] args) {
			Car c = new Car();
			c.start();
		}
}
