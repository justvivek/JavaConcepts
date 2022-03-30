package JavaFundas;
import java.util.*;
public final class CustomImmutableClass {
	private final int id;
	private final String name;
	private final Date doj;//mutable
	private final List<String> tel;
	public CustomImmutableClass(int id, Date doj, String name, List<String> tel) {
		this.id = id;
		this.doj = doj;
		this.name = name;
		this.tel = tel;
	}
	/*To make instance of another mutable class immutable in our immutable class
	 * 
	 * private final Address address;
	 * initialize in Constructor
	 * getter method
	 * 
	 * public Address getAddress(){
	 * 		return new Address(address.getCity(), address.getZip());
	 * }
	 * 
	 * */
	public int getId() {
		return this.id;
	}
	
	public Date getDoj() {
		return (Date)this.doj.clone(); // we have to return the cloned date object so that no one can change the original object
	}
	public String getname() {
		return this.name;
	}
	
	public List<String> getNo(){
//		return this.tel; // if we return this then we can add new element to list
		return new ArrayList<>(tel);// Return new list, so cn't make any changes to existing list
	}
	
	public String toString() {
		return "Employee{ Id:- "+ id+  " DOJ:- "+ doj +" Name:- "+ name + " Telephone No:- "+ tel+ " }";
	}
	
	public static void main(String[] args) {
		Date date = new Date();
		List<String> arr = new ArrayList<>();
		arr.add("1234");
		arr.add("5678");
		CustomImmutableClass emp = new CustomImmutableClass(100, date, "Virat", arr);
		System.out.println(emp.toString());
		
		emp.getNo().add("6543");
		System.out.println(emp.toString());
	}
}
