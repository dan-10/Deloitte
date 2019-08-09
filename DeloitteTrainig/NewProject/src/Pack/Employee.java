package Pack;

public class Employee {
	private int i;
	
	Employee(int i){
		this.i = i;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (i != other.i)
			return false;
		return true;
	}

	public static void main(String[] args) {
		Employee e = new Employee(3);
		Employee e1 = new Employee(3);
		
		System.out.println(e.equals(e1));
		String n = "New";
		String m = new String("New");
		
		System.out.println(n==m);
	}
}
