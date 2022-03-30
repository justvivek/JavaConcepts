package constructorReference;

public class consRefDemo {
	public static void main(String[] args) {
		System.out.println("-------Using Lambda-------");
		
		// Using lambda we have provided definition of getStudent method
		Provider prov1 = () -> new Student();
		
		//Using Provider reference we can now get the Student instance and store it in Student object
		Student s1 = prov1.getStudent();
		s1.display();
		System.out.println(s1.hashCode());
		
		System.out.println("-------Constructor Reference-------");
		//Constructor reference
		//ClassName::new;
		Provider prov2 = Student::new;
		
		Student s2 = prov2.getStudent();
		s2.display();
		System.out.println(s2.hashCode());
	}
}
