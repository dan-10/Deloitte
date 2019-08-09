package pack1;

import java.io.Serializable;

public class Employee implements Serializable, Comparable<Employee>{
	
	public int id;
	public String name;
	public String department;
	
	Employee(int id, String name, String department){
		this.id = id;
		this.name = name ;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]" + "\n" ;
	}
	

	
	@Override
	public int compareTo(Employee o) {
		if((this.name.compareTo(o.name)) < 0)
			return -1;
		return 0;
	}
	
}
