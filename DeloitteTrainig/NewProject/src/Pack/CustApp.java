package Pack;

public class CustApp {
	public static void main(String[] args) {
		Customer c1 = new Customer(1, "One", 100,"Bangalore");
		Customer c2 = new Customer(1, "One", 100,"Bangalore");
		Customer c3 = new Customer(2, "Two", 200,"Bhopal");
		
		System.out.println("Checking for equality");
		System.out.println("Is cust1 equal to cust 2 ? " + c1.equals(c2));
		System.out.println("Is cust1 equal to cust 3 ? " + c1.equals(c3));
		System.out.println("Is cust2 equal to cust 3 ? " + c3.equals(c2));
		System.out.println();
		System.out.println("Hascodes:");
		System.out.println("cust1 : "+c1.hashCode());
		System.out.println("cust1 : "+c2.hashCode());
		System.out.println("cust2 : "+c3.hashCode());
		System.out.println();
		System.out.println("To String");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
