package pack1;

public class InnerClass {
	public class B{
		public void display() {
			System.out.println("Innerclass");
		}
	}
	public static void main(String[] args) {
		InnerClass i = new InnerClass();
		InnerClass.B b = i.new B();
		b.display();
	}
}
