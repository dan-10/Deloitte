package Pack;

public class Student {
	private String name;
	private int id;
	private int marks;
	private int fees;
	
	Student(){
		name = "NA";
		id = 0;
		fees = 10000;
		marks = 50;
	}
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fees;
		result = prime * result + id;
		result = prime * result + marks;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
    
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + ", fees=" + fees + "]";
	}

	Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	public static void main(String args[]) {
	 	Student s = new Student("D",10);
	 	System.out.println(s.name);
	 	Student s1 = new Student("D",10);
	 	System.out.println(s1.hashCode());
	 	System.out.println(s.hashCode());
	 	System.out.println(s.equals(s1));
	 	System.out.println(s);
	}
	
}
