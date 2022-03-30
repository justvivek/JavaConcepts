package JavaFundas;
import java.util.HashSet;
import java.util.Objects;
class Employee{
	int id;
	String name;
	public Employee() {}
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//Whenever we are overriding HashCode we should override equals also, otherwise behavior of custom class might not be correct
	public int hashCode() {
		return id;
//		return Objects.hash(id,name);
	}
	 public boolean equals(Object obj) {
		 if(this == obj) return true;
		 if(obj == null || getClass() != obj.getClass()) return false;
		 Employee e= (Employee)obj;
		 return this.id == e.id && this.name.equals(e.name);
	 }
	 public String toString() {
		 return "EMPLOYEE {ID:- "+ this.id+ " Name:- "+ this.name+ " }";
	 }
}
public class HashCodeEqualsContract {
	public static void main(String[] args) {
		Employee e1 = new Employee(100,"virat");
		Employee e2 = new Employee(100,"virat");
		
		//If we don't override hashCode and equals method then HashSet will add duplicate employees, which is against HashSet properties.
		HashSet<Employee> hs = new HashSet<>();
		hs.add(e1);
		hs.add(e2);
		System.out.println(hs);
		
	}
}
